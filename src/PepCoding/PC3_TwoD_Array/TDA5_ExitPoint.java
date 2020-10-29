package PepCoding.PC3_TwoD_Array;

import java.util.Scanner;

public class TDA5_ExitPoint {
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

        int[] points = exitPoint(arr);
        System.out.println(points[0] + " , " + points[1]);
    }

    private static int[] exitPoint(int[][] arr) {


        int i = 0;
        int j = 0;
        int[] point = new int[2];
        int dir = 0; // 0-e , 1-s , 2-w , 3-n
        while (true) {

            if (i < 0) {
                i++;
                point[0] = i;
                point[1] = j;
                break;
            } else if (j < 0) {
                j++;
                point[0] = i;
                point[1] = j;
                break;
            } else if (i == arr.length) {
                i--;
                point[0] = i;
                point[1] = j;
                break;
            } else if (j == arr[0].length) {
                j--;
                point[0] = i;
                point[1] = j;
                break;
            }
            dir = (dir + arr[i][j]) % 4;


            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

        }
        return point;
    }
}


//Input:
//4 4
//0 0 1 0
//1 0 0 1
//0 0 0 1
//1 0 1 0
//Output:
// 2 , 0