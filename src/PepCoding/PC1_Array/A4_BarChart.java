package PepCoding.PC1_Array;

import java.util.Scanner;

public class A4_BarChart {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = max; i > 0; i--) {

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] >= i) {
                    System.out.print(" * ");
//                    arr[k] = arr[k] - 1;
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}

//5
//        3
//        1
//        0
//        7
//        5
//        *
//        *
//        *  *
//        *  *
//        *        *  *
//        *        *  *
//        *  *     *  *
