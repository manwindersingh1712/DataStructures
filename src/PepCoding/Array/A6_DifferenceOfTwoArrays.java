package PepCoding.Array;

import java.util.Scanner;

public class A6_DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        int n1 = scrn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scrn.nextInt();
        }

        int n2 = scrn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scrn.nextInt();
        }

        int[] finalArray = new int[n2];

        int carry = 0;

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = finalArray.length - 1;

        while (k >= 0) {
            int val = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + carry >= a1v) {
                val = a2[j] + carry - a1v;
                carry = 0;
            } else {
                val = a2[j] + carry + 10 - a1v;
                carry = -1;
            }

            finalArray[k] = val;
            i--;
            j--;
            k--;
        }
        boolean flag = false;
        for (i = 0; i < finalArray.length; i++) {

            if (finalArray[i] == 0 && !flag) {
                continue;
            }

            flag = true;
            System.out.println(finalArray[i]);
        }

    }
}
