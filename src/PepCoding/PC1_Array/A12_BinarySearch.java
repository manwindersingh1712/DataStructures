package PepCoding.PC1_Array;

import java.util.Scanner;

public class A12_BinarySearch {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scrn.nextInt();
        }
        int data = scrn.nextInt();

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (data == arr[mid]) {
                System.out.println(arr[mid] + " is at " + mid + " index");
                break;
            }

            if (data < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }

        }


    }
}
