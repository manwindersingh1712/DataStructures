package Assingnment4;

import java.util.Scanner;

public class Q14_SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        int n = scrn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scrn.nextInt();
        }


        int m = scrn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scrn.nextInt();
        }

        int[] finalArray = new int[Math.max(n, m)];
        int carry = 0;
        int i = n - 1, j = m - 1, k = Math.max(n, m) - 1;

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
            System.out.print(finalArray[i] + " ");
        }

    }
}
