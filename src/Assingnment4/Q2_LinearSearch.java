package Assingnment4;

import java.util.Scanner;

//Linear search

public class Q2_LinearSearch {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        int idx = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int m = scrn.nextInt();

        for (int i = 0; i < n; i++) {
            if (m == arr[i]) {
                idx = i;
            }
        }
        System.out.println(idx + " is the index postion for " + m);
    }
}