package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA8_DiagonalPrint {
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

        printDiagonal(arr);
    }

    private static void printDiagonal(int[][] arr) {

        for (int j = 0; j < arr[0].length; j++) {
            int x = 0;
            int y = j;
            while (y <= arr[0].length - 1) {
                System.out.println(arr[x][y]);
                x++;
                y++;
            }
        }
    }
}

