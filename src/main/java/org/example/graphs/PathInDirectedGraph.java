package org.example.graphs;

import java.util.*;

public class PathInDirectedGraph {

    public static void main(String[] args) {
        /*
            A = 5

            B = [  [1, 2]
            [4, 1]
            [2, 4]
            [3, 4]
            [5, 2]
            [1, 3] ]

         */
    }

    public int solve(int A, int[][] B) {

        HashMap<Integer, List<Integer>> adjacents = new HashMap<>();
        boolean[] visited = new boolean[A+1];
        for(int i = 0; i < B.length; i++){
            int key = B[i][0];
            if(adjacents.get(key) != null){
                List<Integer> list = adjacents.get(key);
                list.add(B[i][1]);
                adjacents.put(key, list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(B[i][1]);
                adjacents.put(key, list);
            }
        }

        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(1);
        for(int i = 2; i <= A; i++){
            while(!bfsQueue.isEmpty()){
                if(bfsQueue.peek() == A){
                    return 1;
                }else{
                    int top = bfsQueue.remove();
                    visited[top] = true;
                    if(adjacents.get(top) != null){
                        List<Integer> list = adjacents.get(top);
                        for(int k = 0; k < list.size(); k++){
                            int node = list.get(k);
                            if(visited[node] == false)
                                bfsQueue.add(node);
                        }
                    }
                }
            }
        }

        return 0;
    }
}

