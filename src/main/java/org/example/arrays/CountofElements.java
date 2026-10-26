package org.example.arrays;

public class CountofElements {

    public static void main(String[] args) {
        /*

            Example Input

            Input 1:
            A = [3, 1, 2]
            Input 2:
            A = [5, 5, 3]


            Example Output

            Output 1:
            2
            Output 2:
            1

         */
    }

    public int solve(int[] A) {

        int N = A.length;
        int max = A[0];
        int maxCount = 0;
        for(int i = 1; i < N; i++){
            if(A[i] >= max){
                max = A[i];
            }
        }

        for(int i = 0; i < N; i++){
            if(A[i] == max)
                maxCount++;
        }

        return (N - maxCount);

    }
}

