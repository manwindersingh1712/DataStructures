package Assingnment4;

import java.util.Scanner;

public class Q1_MaxInArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
