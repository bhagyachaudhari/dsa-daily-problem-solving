package org.example.strings;

public class ToggleCase {

    public static void main(String[] args) {

        /*

            Example Input

            Input 1:

             A = "Hello"
            Input 2:

             A = "tHiSiSaStRiNg"


            Example Output

            Output 1:

             hELLO
            Output 2:

             ThIsIsAsTrInG

         */

    }

    public String solve(String A) {

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            char ch = A.charAt(i);
            if(ch >= 65 && ch <= 90)
                ans.append((char)(ch + 32));
            else if(ch >= 97 && ch <= 122)
                ans.append((char)(ch - 32));
        }

        return ans.toString();
    }

}
