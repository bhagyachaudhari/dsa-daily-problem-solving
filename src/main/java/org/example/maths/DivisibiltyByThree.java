package org.example.maths;

public class DivisibiltyByThree {

    public static void main(String[] args) {
        DivisibiltyByThree divisibiltyByThree = new DivisibiltyByThree();
        int[] A = {1, 4, 1, 2};
        System.out.println(divisibiltyByThree.solve(A));
        int[] B = {1, 2, 3};
        System.out.println(divisibiltyByThree.solve(B));
    }

    public int solve(int[] A) {

        int sum = 0;
        int t = 1;
        for(int i = A.length-1; i >= 0; i--){
            sum = (sum + ((A[i] * t) % 3)) % 3;
            t = (t * 10) % 3;
        }

        return (sum % 3) == 0 ? 1 : 0;
    }


}
