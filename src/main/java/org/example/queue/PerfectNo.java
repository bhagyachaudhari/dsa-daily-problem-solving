package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNo {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static String generate(int k) {

        Queue<String> q = new LinkedList<>();
        q.add("11");
        q.add("22");
        int idx = 2;
        while(!q.isEmpty()){
            String str = "1" + q.poll() + "1";
            q.add(str);
            idx++;

            if(k == idx)
                return str;
        }

        return "";
    }
}

/*

Q1. Perfect Numbers
Solved
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.
The number of digits in a Perfect number is even.
It is a palindrome number.
For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.





Problem Constraints

1 <= A <= 100000



Input Format

The only argument given is an integer A.



Output Format

Return a string that denotes the Ath Perfect Number.



Example Input

Input 1:

 A = 2
Input 2:

 A = 3


Example Output

Output 1:

 22
Output 2:

 1111


Example Explanation

Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Return the 2nd Perfect number.
Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Return the 3rd Perfect number.

*/