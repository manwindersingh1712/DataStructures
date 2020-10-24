package PepCoding.Array;

import java.util.Scanner;

// Question:
// https://www.youtube.com/watch?v=ZictKDbUWak&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=31
public class A8_RotateArray {
    //    public static void main(String[] args) {
//        Scanner scrn = new Scanner(System.in);
//        int n = scrn.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scrn.nextInt();
//        }
//
//        int k = scrn.nextInt();
//        if (k >= n) {
//            k = k % n;
//        }
//
//        if (k < 0) {
//            k = Math.abs(k);
//
//            if (k >= n) {
//                k = k % n;
//            }
//            k = n - k;
//        }
//
//
//        for (int i = 0; i < k; i++) {
//            for (int j = n - 1; j > 0; j--) {
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
//
//    }
//                                |
//                                |
//                                |
//                                |
//                                OR
//                                |
//                                |
//                                |
//                                V
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        int k = scrn.nextInt();

        rotate(arr, k);

    }

    private static void rotate(int[] arr, int k) {

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
//        part1
        reverse(arr, 0, arr.length - k - 1);

//                part2
        reverse(arr, arr.length - k, arr.length - 1);
//        all
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverse(int[] arr, int i, int j) {

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
