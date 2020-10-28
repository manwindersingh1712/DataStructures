package PepCoding.TwoD_Array;

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
            multiply(arr1, row1, col1, arr2, row2, col2,fArr);
        } else {
            System.out.println("Invalid Input");
        }

    }

    private static void multiply(int[][] arr1, int row1, int col1, int[][] arr2, int row2, int col2, int[][] fArr) {
        

    }
}
