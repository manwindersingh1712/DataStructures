package PepCoding.Array;

import java.util.Scanner;

public class A3_FindIndexOfArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        int data = scrn.nextInt();

        int index = findIndex(arr, data);
        if (index == -1) {
            System.out.println("Not found!!");
        } else {
            System.out.println(data + " is at " + index + " index");
        }
    }

    private static int findIndex(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
