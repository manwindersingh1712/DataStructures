package PepCoding.PC1_Array;

import java.util.Scanner;

public class A14_LastIndex {
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
        int lastIndex = 0;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (data > arr[mid]) {
                l = mid + 1;
            } else if (data < arr[mid]) {
                h = mid - 1;
            }

            if (data == arr[mid]) {
                lastIndex = mid;
                l = mid + 1;
            }
        }

        System.out.println(lastIndex);

    }
}
