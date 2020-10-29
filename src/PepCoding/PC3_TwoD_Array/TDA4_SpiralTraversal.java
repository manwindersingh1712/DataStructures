package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA4_SpiralTraversal {
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

        spiralTraversal(arr);
    }

    private static void spiralTraversal(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total = arr[0].length * arr.length;
        int ctn = 0;
        while (total > ctn) {

            //left wall
            for (int i = minr; i <= maxr && total > ctn; i++) {
                System.out.println(arr[i][minc]);
                ctn++;
            }
            minc++;

            //bottom wall
            for (int i = minc; i <= maxc && total > ctn; i++) {
                System.out.println(arr[maxr][i]);
                ctn++;
            }
            maxr--;

            //right wall
            for (int i = maxr; i >= minr && total > ctn; i--) {
                System.out.println(arr[i][maxc]);
                ctn++;
            }
            maxc--;

            //top wall
            for (int i = maxc; i >= minc && total > ctn; i--) {
                System.out.println(arr[minr][i]);
                ctn++;
            }

            minr++;

        }
    }
}
