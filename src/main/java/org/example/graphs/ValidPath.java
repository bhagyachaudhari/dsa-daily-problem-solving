package org.example.graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPath {

    int x[] = new int[] {1,1,1,0,0,-1,-1,-1};
    int y[] = new int[] {1,-1,0,1,-1,1,-1,0};

    boolean visited[][];

    public String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {

        visited = new boolean[B+1][A+1];
        return DFS(0, 0, A, B, E, F, D) ? "YES" : "NO";
    }


    private boolean DFS(int row, int col, int A, int B, ArrayList<Integer> E, ArrayList<Integer> F, int D) {

        if(!checkValidity(row, col, A, B, E, F, D))
            return false;

        if(row == B && col == A)
            return true;

        visited[row][col] = true;

        boolean ans = false;

        for(int i = 0; i < 8; i++) {

            int r = y[i], c = x[i];

            if(DFS( row + r, col + c, A, B, E, F, D))
                ans = true;

        }
        return ans;
    }


    private boolean checkValidity(int row, int col, int A, int B, ArrayList<Integer> E, ArrayList<Integer> F, int D){

        if(row < 0 || col < 0 || row > B || col > A || visited[row][col])
            return false;

        for(int i = 0; i < E.size(); i++) {

            double dis = Math.pow(row - F.get(i), 2) + Math.pow(col - E.get(i), 2);
            dis = Math.sqrt(dis);

            if(dis <= D)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> E =  new ArrayList<>();
        E.add(2);
        ArrayList<Integer> F =  new ArrayList<>();
        F.add(3);
        new ValidPath().solve(2, 3, 1, 1, E, F);
    }
}
