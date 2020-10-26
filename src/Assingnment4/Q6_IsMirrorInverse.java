package Assingnment4;

import java.util.Scanner;

public class Q6_IsMirrorInverse {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int[] newArr = new int[n];

        boolean chk = isInverse(newArr, arr);
        if (chk) {
            System.out.println("Yes it is Mirror Inverse");
        } else {
            System.out.println("No it is not a Mirror Inverse");
        }
    }

    private static boolean isInverse(int[] newArr, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != newArr[i]) {
                return false;
            }
        }

        return true;
    }


}
