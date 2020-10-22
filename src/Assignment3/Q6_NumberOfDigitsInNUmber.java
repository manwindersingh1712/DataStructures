package Assignment3;

import java.util.Scanner;

public class Q6_NumberOfDigitsInNUmber {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int num = scrn.nextInt();
        int digit = scrn.nextInt();

        System.out.println(numberOfDigits(num, digit));

    }

    private static int numberOfDigits(int num, int digit) {
        int c = 0;

        while (num != 0) {
            int a = num % 10;
            if (a == digit) {
                c++;
            }
            num = num / 10;
        }

        return c;
    }
}
