package PepCoding.PC3_TwoD_Array;
//https://www.youtube.com/watch?v=0dGuTLr6xT4&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=3

import java.util.Scanner;

public class TDA2_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int row1 = scrn.nextInt();
        int col1 = scrn.nextInt();
        int[][] arr1 = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = scrn.nextInt();
            }
        }

        int row2 = scrn.nextInt();
        int col2 = scrn.nextInt();
        int[][] arr2 = new int[row2][col2];

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = scrn.nextInt();
            }
        }
        int[][] fArr = new int[row1][col2];
        if (col1 == row2) {
            multiply(arr1, row1, col1, arr2, row2, col2, fArr);
        } else {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(fArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void multiply(int[][] arr1, int row1, int col1, int[][] arr2, int row2, int col2, int[][] fArr) {

        for (int row = 0; row < fArr.length; row++) {
            for (int col = 0; col < fArr[0].length; col++) {
                for (int i = 0; i < col1; i++) {
                    fArr[row][col] += arr1[row][i] * arr2[i][col];
                }
            }

        }

    }
}

//input:  2 3
//        11 12 13
//        21 22 23
//        3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//output: 776 812 848 884
//        1406 1472 1538 1604