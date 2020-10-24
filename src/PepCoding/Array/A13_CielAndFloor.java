package PepCoding.Array;

import java.util.Scanner;
// Question:
// https://www.youtube.com/watch?v=kQx7nvN_8e4&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=40

public class A13_CielAndFloor {
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
        int ciel = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (data > arr[mid]) {
                floor = arr[mid];
                l = mid + 1;
            } else if (data < arr[mid]) {
                ciel = arr[mid];
                h = mid - 1;
            }

            if (data == arr[mid]) {
                floor = arr[mid];
                ciel = arr[mid];
                l = mid + 1;
                h = mid - 1;
            }

        }

        System.out.println("Floor value for " + data + " is " + floor);
        System.out.println("Ciel value for " + data + " is " + ciel);
    }
}
