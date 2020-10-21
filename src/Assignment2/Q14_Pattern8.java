package Assignment2;

import java.util.Scanner;

public class Q14_Pattern8 {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int spaces = n - 1;
        int stars = 1;
        int val = 1;

        for (int i = 0; i <= 2 * n - 2; i++) {
//            System.out.println(spaces + " , " + stars);
            for (int j = 0; j < spaces; j++) {
                System.out.print("   ");
            }
            int cval = val;
            for (int j = 0; j < stars; j++) {
                System.out.print(" " + cval + " ");
                if (j < stars / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            System.out.println();

            if (i < n - 1) {
                spaces--;
                stars += 2;
                val++;
            } else {
                spaces++;
                stars -= 2;
                val--;
            }
        }
    }
}
