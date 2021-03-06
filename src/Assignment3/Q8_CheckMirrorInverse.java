package Assignment3;

import java.util.Scanner;

public class Q8_CheckMirrorInverse {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        System.out.println(isInverse(n));

    }

    private static boolean isInverse(int n) {

        int inv = mirrorInverse(n);
        if (n == inv) {
            return true;
        }
        return false;
    }

    private static int mirrorInverse(int n) {

        int res = 0, counter = 1;

        while (n != 0) {
            int a = n % 10;
            res = (int) (res + (counter * Math.pow(10, a - 1)));
            counter++;
            n = n / 10;
        }
        return res;
    }
}
