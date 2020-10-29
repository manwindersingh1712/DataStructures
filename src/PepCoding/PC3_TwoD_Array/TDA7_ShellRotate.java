package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA7_ShellRotate {
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

        int shell = scrn.nextInt();
        int rotate = scrn.nextInt();

        shellRotate(arr, shell, rotate);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void shellRotate(int[][] arr, int shell, int rotate) {
        int minr = shell - 1;
        int minc = shell - 1;
        int maxr = arr.length - 1 - minr;
        int maxc = arr[0].length - 1 - minc;
        int size = 2 * (maxr - minr + 1) + 2 * (maxc - minc + 1) - 4;
        int[] newArr = new int[size];

        //Adding all elements to array
        //left wall;
        int k = 0;
        for (int i = minr; i < maxr; i++) {
            newArr[k] = arr[i][minc];
            k++;
        }
        //bottom wall
        for (int i = minc; i < maxc; i++) {
            newArr[k] = arr[maxr][i];
            k++;
        }
        //right wall
        for (int i = maxr; i > minr; i--) {
            newArr[k] = arr[i][maxc];
            k++;
        }
        //top wall
        for (int i = maxc; i > minc; i--) {
            newArr[k] = arr[minr][i];
            k++;
        }

        //Rotating array
        rotate(newArr, rotate);

        //adding back to matrix
        k = 0;
        //left wall;
        for (int i = minr; i < maxr; i++) {
            arr[i][minc] = newArr[k];
            k++;
        }
        //bottom wall
        for (int i = minc; i < maxc; i++) {
            arr[maxr][i] = newArr[k];
            k++;
        }
        //right wall
        for (int i = maxr; i > minr; i--) {
            arr[i][maxc] = newArr[k];
            k++;
        }
        //top wall
        for (int i = maxc; i > minc; i--) {
            arr[minr][i] = newArr[k];
            k++;
        }


    }

    private static void rotate(int[] arr, int k) {

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
//        part1
        reverse(arr, 0, arr.length - k - 1);

//                part2
        reverse(arr, arr.length - k, arr.length - 1);
//        all
        reverse(arr, 0, arr.length - 1);

    }

    private static void reverse(int[] arr, int i, int j) {

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}

//
//Input:  6 6
//        11 12 13 14 15 16
//        21 22 23 24 25 26
//        31 32 33 34 35 36
//        41 42 43 44 45 46
//        51 52 53 54 55 56
//        61 62 63 64 65 66
//        2
//        1

//Output: 11 12 13 14 15 16
//        21 23 24 25 35 26
//        31 22 33 34 45 36
//        41 32 43 44 55 46
//        51 42 52 53 54 56
//        61 62 63 64 65 66