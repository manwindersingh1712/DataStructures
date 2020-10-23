package Assignment3;

import java.util.Scanner;

public class Q19_SeriesCheck {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        System.out.println(checkSeries(arr));


    }

    private static boolean checkSeries(int[] arr) {
        int i = 0;
        boolean inc = false, dec = false;


        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                inc = true;
                i++;
            } else {
                break;
            }
        }
        if (i != 0) {
            i++;
        }
        if (i == arr.length - 1) {
            return true;
        } else {
            while (i < arr.length - 1) {

                if (arr[i] < arr[i + 1]) {
                    i++;
                    dec = true;
                } else {
                    return false;
                }
            }
        }
        if (i == arr.length - 1 && inc == true && dec == true) {
            return true;
        } else {
            return false;
        }
    }
}
