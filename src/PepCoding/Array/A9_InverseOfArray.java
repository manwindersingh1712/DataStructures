package PepCoding.Array;

import java.util.Scanner;

// Question:
// https://www.youtube.com/watch?v=TCDPgRgCNr0&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=33
public class A9_InverseOfArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[arr[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(newArr[i]);
        }
    }
}
