package org.example.twopointer;

public class PairSubtraction {

    public static void main(String[] args) {
        System.out.println(new PairSubtraction().findPair(new int[]{-5, -2, 1, 8, 10, 12, 15}, 11));
    }

    private String findPair(int[] A, int k) {
        int p1 = 0;
        int p2 = 1;
        int a = A[p1];
        int b = A[p2];

        while(p2 < A.length){
            if(b-a < k)
                p2++;
            else if(b-a > k)
                p1++;
            else
                return "("+p1+","+p2+")";

            a = A[p1];
            b = A[p2];
        }
        return "";
    }
}
