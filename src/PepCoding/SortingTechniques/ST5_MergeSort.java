package PepCoding.SortingTechniques;

import java.util.Scanner;

public class ST5_MergeSort {
    public static void main(String[] args) {

        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        int[] sorted = mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

    }

    private static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] baseArray = new int[1];
            baseArray[0] = arr[lo];
            return baseArray;
        }

        int mid = (lo + hi) / 2;

        return mergeArrays(mergeSort(arr, lo, mid), mergeSort(arr, mid + 1, hi));

    }

    private static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = a1.length;
        int m = a2.length;
        int[] fArr = new int[n + m];

        while (i < n && j < m) {

            if (a1[i] < a2[j]) {
                fArr[k] = a1[i];
                k++;
                i++;
            } else if (a1[i] > a2[j]) {
                fArr[k] = a2[j];
                k++;
                j++;
            }
        }
        while (j < m) {
            fArr[k] = a2[j];
            j++;
            k++;
        }
        while (i < n) {
            fArr[k] = a1[i];
            i++;
            k++;
        }

        return fArr;
    }

}
