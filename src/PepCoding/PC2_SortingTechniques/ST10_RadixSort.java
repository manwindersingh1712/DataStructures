package PepCoding.PC2_SortingTechniques;

import java.util.Scanner;

public class ST10_RadixSort {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        radixSort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        int exp = 1;

        while (max >= exp) {
            countSort(arr, exp);
            exp = exp * 10;
        }
    }

    private static void countSort(int[] arr, int exp) {
        int[] frequencyArray = new int[10];


        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] / exp % 10;
            frequencyArray[idx]++;
        }
// making frequency array a prefix sum array
        for (int i = 1; i < 10; i++) {
            frequencyArray[i] = frequencyArray[i - 1] + frequencyArray[i];
        }

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int position = frequencyArray[arr[i] / exp % 10];
            int idx = position - 1;

            ans[idx] = arr[i];
            frequencyArray[arr[i] / exp % 10]--;

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

    }
}
