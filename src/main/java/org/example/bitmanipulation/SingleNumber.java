package org.example.bitmanipulation;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] A = {1, 2, 2, 3, 1, 3, 3};
        System.out.println(singleNumber.singleNumber(A)); // Output: 3

        int[] B = {1, 2, 2};
        System.out.println(singleNumber.singleNumber(B)); // Output: 1
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {

        int ans = A[0];
        for(int i = 1; i < A.length; i++){
            ans = ans ^ A[i];
        }

        return ans;
    }
}

/*

Q3. Single Number
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints

1 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format

The first and only argument of input contains an integer array A.



Output Format

Return a single integer denoting the single element.



Example Input

Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output

Output 1:

 3
Output 2:

 1


Example Explanation

Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.


 */

