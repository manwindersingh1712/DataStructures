package Assignment3;

import java.util.Scanner;

public class Q5_MaxMinF2C {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int min = scrn.nextInt();
        int max = scrn.nextInt();
        int step = scrn.nextInt();

        for (int i = min; i <= max; i += step) {
            int a = (5 * (i - 32)) / 9;
            System.out.println(i + "  " + a);
        }
    }
}
