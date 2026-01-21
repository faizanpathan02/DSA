package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse_array {

    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return; // Base case: When the pointers meet or cross each other
        }

        // Swap elements at left and right pointers
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call with updated pointers
        reverseArray(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call recursive function to reverse the array
        reverseArray(arr, 0, arr.length - 1);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
