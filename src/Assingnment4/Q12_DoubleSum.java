package Assingnment4;

import java.util.Scanner;

public class Q12_DoubleSum {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int target = scrn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}
