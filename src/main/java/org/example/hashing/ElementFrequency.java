package org.example.hashing;


import java.util.HashMap;

public class ElementFrequency {

    public static void main(String[] args) {

        /*

            Example Input

            Input 1:
            A = [1, 2, 1, 1]
            B = [1, 2]
            Input 2:
            A = [2, 5, 9, 2, 8]
            B = [3, 2]


            Example Output

            Output 1:
            [3, 1]
            Output 2:
            [0, 2]

         */
    }

    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[B.length];

        for(int i = 0; i < A.length; i++){
            if(map.get(A[i]) == null){
                map.put(A[i], 1);
            }else{
                int freq = map.get(A[i]);
                map.put(A[i], ++freq);
            }
        }

        for(int j = 0; j < B.length; j++){
            ans[j] = map.get(B[j]) == null ? 0 : map.get(B[j]);
        }

        return ans;
    }
}

