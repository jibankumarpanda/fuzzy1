package two_pointer;

import java.util.*;

public class swapusing {
     static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroAndOnes(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left forward while we find 0
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right backward while we find 1
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Now arr[left] = 1 and arr[right] = 0
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " +java.util.Arrays.toString(arr));

        sortZeroAndOnes(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
