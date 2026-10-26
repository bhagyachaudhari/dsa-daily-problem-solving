package org.example.greedy;

public class DistributeCandy {

    public static void main(String[] args) {

    }

    public int candy(int[] A) {
        int N = A.length;
        int[] left = new int[N];
        int[] right = new int[N];
        int ans = 0;

        for(int i = 0; i < N; i++){
            left[i] = 1;
        }

        for(int i = 1; i < N; i++){
            if(A[i] > A[i-1]){
                left[i] = left[i-1] + 1;
            }
        }

        for(int i = 0; i < N; i++){
            right[i] = 1;
        }

        for(int i = N-2; i >= 0; i--){
            if(A[i] > A[i+1]){
                right[i] = right[i+1] + 1;
            }
        }

        for(int i = 0; i < N; i++){
            ans = ans + max(right[i], left[i]);
        }
        return ans;
    }

    public int min(int n1, int n2){
        return n1 < n2 ? n1 : n2;
    }
    public int max(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
}

