package PepCoding.SortingTechniques;

import java.util.Scanner;

public class ST6_PartitionOfArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int pivot = scrn.nextInt();

        partition(arr, pivot);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void partition(int[] arr, int pivot) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
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

    }
}
