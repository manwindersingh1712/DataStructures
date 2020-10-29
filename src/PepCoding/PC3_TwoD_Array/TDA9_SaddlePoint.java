package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA9_SaddlePoint {
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

        int sp = saddlePoint(arr);
        if (sp == -1) {
            System.out.println("Invalid Input!!");
        } else {
            System.out.println(sp);

        }
    }

    private static int saddlePoint(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            int y = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][y]) {
                    y = j;
                }
            }

            boolean flag = true;
            for (int x = 0; x < arr.length; x++) {
                if (arr[x][y] > arr[i][y]) {
                    flag = false;
                }
            }

            if (flag) {
                return arr[i][y];
            }
        }

        return -1;
    }
}

