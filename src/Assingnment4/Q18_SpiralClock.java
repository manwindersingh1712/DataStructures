package Assingnment4;

import java.util.Scanner;

public class Q18_SpiralClock {
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

            //top wall
            for (int i = minc; i <= maxc && total > ctn; i++) {
                System.out.print(arr[minr][i] + " ");
                ctn++;
            }
            minr++;

            //right wall
            for (int i = minr; i <= maxr && total > ctn; i++) {
                System.out.print(arr[i][maxc] + " ");
                ctn++;
            }
            maxc--;

            //bottom wall
            for (int i = maxc; i >= minc && total > ctn; i--) {
                System.out.print(arr[maxr][i] + " ");
                ctn++;
            }

            maxr--;
            //left wall
            for (int i = maxr; i >= minr && total > ctn; i--) {
                System.out.print(arr[i][minc] + " ");
                ctn++;
            }
            minc++;

        }
    }
}
//4 4
//11 12 13 14
//21 22 23 24
//31 32 33 34
//41 42 43 44
//Output:
//11 12 13 14 24 34 44 43 42 41 31 21 22 23 33 32