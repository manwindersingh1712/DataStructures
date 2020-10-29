package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA10_SearchInSortedArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int row = scrn.nextInt();
        int col = scrn.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scrn.nextInt();
            }
        }
        int n = scrn.nextInt();

        int[] points = search(arr, n);
        if (points.length == 1) {
            System.out.println("not found");
        } else {
            System.out.println(points[0] + "," + points[1]);
        }
    }

    private static int[] search(int[][] arr, int n) {
        int[] points = new int[2];

        int i = 0;
        int j = arr[0].length - 1;

        while (j >= 0 && i <= arr.length - 1) {
            points[0] = i;
            points[1] = j;

            System.out.println(arr[i][j]);
            if (arr[i][j] == n) {
                return points;
            } else if (arr[i][j] < n) {
                i++;
            } else if (arr[i][j] > n) {
                j--;
            }
        }

        int[] ints = new int[1];
        return ints;
    }
}
//Input:  4 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        41 42 43 44
//        5
//output:
//         2,1