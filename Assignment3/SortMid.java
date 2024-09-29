package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortMid {

    // Method to sort the first half in ascending and second half in descending order
    public static void sortArray(int[] array) {
        int n = array.length;
        int mid = n / 2;

        // Sort the first half in ascending order
        Arrays.sort(array, 0, n);
        Arrays.sort(array, mid, n);
        reverse(array, mid, n);
    }

    private static void reverse(int[] array, int start, int end) {
        end--; 
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
        System.out.println("Original array: " + Arrays.toString(arr));

        sortArray(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}
