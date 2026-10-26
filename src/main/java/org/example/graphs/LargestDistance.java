package org.example.graphs;

import java.util.ArrayList;
import java.util.List;

public class LargestDistance {

    private int diameter = 0;

    public int solve(int[] A) {
        List<List<Integer>> adj = buildGraph(A);
        dfs(adj, 0);
        return diameter;
    }

    public int dfs(List<List<Integer>> adj, int source){

        int maxHeight = 0;

        for(Integer child : adj.get(source)){
            int currHeight = dfs(adj, child);
            diameter = Math.max(diameter, currHeight + maxHeight + 1);
            maxHeight = Math.max(maxHeight, currHeight + 1);
        }

        return maxHeight;
    }

    public List<List<Integer>> buildGraph(int[] input){
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < input.length; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < input.length; i++){
            int elem = input[i];
            if(elem == -1)
                continue;

            list.get(elem).add(i);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(new LargestDistance().solve(new int[] {-1, 0, 0}));
    }
}
