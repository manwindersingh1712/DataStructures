package Assingnment4;

import java.util.Scanner;

public class Q3_BinarySearch__Fast {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        int idx = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int m = scrn.nextInt();

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (arr[mid] > m) {
                h = mid - 1;
            } else if (arr[mid] < m) {
                l = mid + 1;
            }

            if (arr[mid] == m) {
                idx = mid;
                break;
            }
        }

        System.out.println(idx + " is the index postion for " + m);
    }
}
