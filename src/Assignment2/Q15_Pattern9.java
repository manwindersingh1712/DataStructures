package Assignment2;

import java.util.Scanner;

public class Q15_Pattern9 {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int spaces = 2 * n - 3;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int j = 0; j < stars && i != n - 1; j++) {
                System.out.print(" " + val + " ");
                val++;
            }
            for (int j = 0; j < spaces && i != n - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < stars && i != n - 1; j++) {
                val--;
                System.out.print(" " + val + " ");
            }
            if (i < n - 1) {
                System.out.println();
            }
            spaces -= 2;
            stars++;

        }
        int fval = 1;
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print(" " + fval + " ");
            if (i >= n - 1) {
                fval--;
            } else {
                fval++;
            }
        }

    }
}


//Output For: 4
//        1                 1
//        1  2           2  1
//        1  2  3     3  2  1
//        1  2  3  4  3  2  1
