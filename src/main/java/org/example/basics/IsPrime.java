package org.example.basics;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(new IsPrime().solve(5));
        System.out.println(new IsPrime().solve(10));
    }

    public int solve(int A) {

        if(factorsCount(A) == 2)
            return 1;

        return 0;
    }

    public int factorsCount(int A) {

        int factors = 0;

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

