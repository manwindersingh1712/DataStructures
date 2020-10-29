package PepCoding.PC1_Array;

import java.util.Scanner;

public class A15_FirstIndex {
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
        int firstIndex = 0;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (data > arr[mid]) {
                l = mid + 1;
            } else if (data < arr[mid]) {
                h = mid - 1;
            }

            if (data == arr[mid]) {
                firstIndex = mid;
                h = mid - 1;
            }
        }

        System.out.println(firstIndex);

    }

}
