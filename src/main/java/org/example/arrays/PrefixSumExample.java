package org.example.arrays;

public class PrefixSumExample {

    public static int rangeSum(int[] arr, int left, int right) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3};
        System.out.println(rangeSum(arr, 1, 3));
    }
}