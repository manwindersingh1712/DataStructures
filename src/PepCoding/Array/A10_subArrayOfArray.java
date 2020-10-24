package PepCoding.Array;

import java.util.Scanner;

public class A10_subArrayOfArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }

        }

    }
}

//3
//10
//20
//30
//
//output:
//        10
//        10 20
//        10 20 30
//        20
//        20 30
//        30