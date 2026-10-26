package org.example.searching;

public class InsertPosition {

    public static void main(String[] args) {
        /*

            Example Input

            Input 1:

            A = [1, 3, 5, 6]
            B = 5
            Input 2:

            A = [1, 4, 9]
            B = 3


            Example Output

            Output 1:

            2
            Output 2:

            1

         */
    }

    public int searchInsert(int[] A, int B) {

        int N = A.length;
        int lo = 0;
        int hi = N-1;

        if(B < A[0])
            return 0;
        else if(B > A[N-1])
            return N;

        while(lo <= hi){
            int mid = lo + ((hi-lo)/2);
            if(A[mid] == B || (A[mid] > B && A[mid-1] < B)){
                return mid;
            }else if(A[mid] < B){
                lo = mid+1;
            }else if(A[mid] > B){
                hi = mid-1;
            }
        }

        return -1;

    }
}

