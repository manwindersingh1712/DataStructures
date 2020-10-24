package PepCoding.Array;

import java.util.Scanner;

public class A5_SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        int n1 = scrn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scrn.nextInt();
        }


        int n2 = scrn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scrn.nextInt();
        }

        int[] finalArray = new int[Math.max(n1, n2)];
        int carry = 0;
        int i = n1 - 1, j = n2 - 1, k = Math.max(n1, n2) - 1;

        while (i > -1 || j > -1) {
            int sum = carry;

            if (i > -1) {
                sum = sum + arr1[i];
            }
            if (j > -1) {
                sum = sum + arr2[j];
            }

            finalArray[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;


        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }

    }

}
