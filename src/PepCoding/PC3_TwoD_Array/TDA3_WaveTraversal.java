package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA3_WaveTraversal {
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

        waveTraversal(arr);

    }

    private static void waveTraversal(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][i]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[j][i]);
                }
            }
        }
    }
}


//Input:  3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//Output:
//        11
//        21
//        31
//        32
//        22
//        12
//        13
//        23
//        33
//        34
//        24
//        14