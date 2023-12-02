package Recursion.Questions;

// Remove all duplicates from the array

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 5, 6, 7};
        int length = RemoveDuplicates(arr, arr.length);

        // Print the array after removing duplicates
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int RemoveDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[n - 1];
        return j;
    }
}

