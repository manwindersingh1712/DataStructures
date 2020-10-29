package PepCoding.PC1_Array;

import java.util.Scanner;

// Question:
// https://www.youtube.com/watch?v=RJITdlWR1-g&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=29
public class A7_ReverseArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }


        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
