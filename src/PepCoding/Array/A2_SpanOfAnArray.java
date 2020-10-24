package PepCoding.Array;

import java.util.Scanner;

//In this question we find the span of an array of size given by user.
//span is the difference between the max and min value

public class A2_SpanOfAnArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println(max - min);
    }
}
