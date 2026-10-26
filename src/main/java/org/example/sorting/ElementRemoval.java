package org.example.sorting;

public class ElementRemoval {

    public static void main(String[] args) {
        /*
            Example Input

            Input 1:

             A = [2, 1]
            Input 2:

             A = [5]


            Example Output

            Output 1:

             4
            Output 2:

             5

         */
    }

    public int solve(int[] A) {

        //Arrays.sort(A);
        long cost = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){
                if(A[i] < A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int i = 0; i < A.length; i++){
            cost = cost + A[i];
            for(int j = i+1; j < A.length; j++){
                cost = cost + A[j];
            }
        }

        return (int)cost;
    }
}

