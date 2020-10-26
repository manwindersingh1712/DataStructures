package Assingnment4;

import java.util.Scanner;

public class Q9_SelectionSort {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[i] < arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }

        }
    }
}
