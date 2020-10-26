package Assingnment4;

import java.util.Scanner;

public class Q10_InsertionsSort {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        for (int i = 1; i < n; i++) {

            for (int j = i; j > 0; j--) {

                if (arr[j] <= arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
