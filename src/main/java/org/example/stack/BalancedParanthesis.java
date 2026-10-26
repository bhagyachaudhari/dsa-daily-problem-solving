package org.example.stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String A = "({[]})";
        BalancedParanthesis obj = new BalancedParanthesis();
        int result = obj.solve(A);
        System.out.println(result); // Output: 1
    }

    public int solve(String A) {

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < A.length(); i++){
            Character ch = A.charAt(i);
            if(!s.empty()){
                if((ch == '}' && s.peek() == '{') || (ch == ')' && s.peek() == '(') || (ch == ']' && s.peek() == '[')){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }else{
                s.push(ch);
            }
        }

        return s.empty() ? 1 : 0;
    }
}

/*

Q1. Balanced Paranthesis
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints

1 <= |A| <= 100



Input Format

The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format

Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input

Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[]


Example Output

Output 1:

 1
Output 2:

 0
Output 3:

 1


Example Explanation

You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.


*/

