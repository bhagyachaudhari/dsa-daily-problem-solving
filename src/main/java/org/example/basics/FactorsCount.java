package org.example.basics;

public class FactorsCount {

    public static void main(String[] args) {
        /*
            Example Input

            Input 1:
            5
            Input 2:
            10


            Example Output

            Output 1:
            2
            Output 2:
            4

         */
    }

    public int solve(int A) {

        int factors = 0;

        //Brute Force => O(N)
        /*for(int i = 1; i <= A; i++){
            if(A % i == 0)
                factors++;
        }*/

        //Optimization => O(square root of N)
        for(int i = 1; i*i <= A; i++){
            if(A % i == 0){
                if(A / i == i){
                    factors++;
                }else{
                    factors = factors + 2;
                }
            }
        }

        return factors;
    }
}
