package org.example.arrays;

public class LargestElement {

    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        // Normal Case:

        int[] arr = {10, 25, 7, 42, 18};
        int result = findLargest(arr);
        System.out.println("Normal Case :: Largest element: " + result);

        // Single Element Case:

        int[] arr1 = {100};
        int result1 = findLargest(arr);
        System.out.println("Single Element Case :: Largest element: " + result1);

        // Duplicate Elements Case:

        int[] arr2 = {5,5,5};
        int result2 = findLargest(arr);
        System.out.println("Duplicate Elements Case :: Largest element: " + result2);

        // All Negative Elements Case:

        int[] arr3 = {-1, -3, -6};
        int result3 = findLargest(arr);
        System.out.println("All Negative Elements Case :: Largest element: " + result3);

        // Contains Zero Case:

        int[] arr4 = {-10, 0, 9, -3};
        int result4 = findLargest(arr);
        System.out.println("Contains Zero Case :: Largest element: " + result4);

        // Ascending Order Case:

        int[] arr5 = {1, 2, 3};
        int result5 = findLargest(arr);
        System.out.println("Ascending Order Case :: Largest element: " + result5);

        // Descending Order Case:

        int[] arr6 = {9, 7, 4};
        int result6 = findLargest(arr);
        System.out.println("Descending Order Case :: Largest element: " + result6);


    }
}
