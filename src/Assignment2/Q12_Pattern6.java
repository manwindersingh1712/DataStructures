package Assignment2;

import java.util.Scanner;

public class Q12_Pattern6 {
    public static void main(String[] args) {

        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int stars = n / 2 + 1;
        int spaces = 1;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < stars; k++) {
                System.out.print(" * ");
            }
            for (int k = 0; k < spaces; k++) {
                System.out.print("   ");
            }
            for (int k = 0; k < stars; k++) {
                System.out.print(" * ");
            }
            System.out.println();
            if (i < n / 2) {
                stars--;
                spaces += 2;

            } else {
                stars++;
                spaces -= 2;
            }
        }
    }
}


//Output For: 7
//        *  *  *  *     *  *  *  *
//        *  *  *           *  *  *
//        *  *                 *  *
//        *                       *
//        *  *                 *  *
//        *  *  *           *  *  *
//        *  *  *  *     *  *  *  *