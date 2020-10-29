package PepCoding.PC2_SortingTechniques;

import java.util.Scanner;

public class ST7_QuickSort {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return;
        }

        int pi = partition(arr, arr[hi], lo, hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi + 1, hi);
    }

    private static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;

        while (i <= hi) {

            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }

        return j - 1;
    }
}
