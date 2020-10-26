package Assingnment4;

import java.util.Scanner;

public class Q5_InverseArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

}
