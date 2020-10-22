package Assignment3;

import java.util.Scanner;

public class Q7_MirrorInverse {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int res = 0, counter = 1;

        while (n != 0) {
            int a = n % 10;
            res = (int) (res + (counter * Math.pow(10, a - 1)));
            counter++;
            n = n / 10;
        }

        System.out.println(res);
    }
}
