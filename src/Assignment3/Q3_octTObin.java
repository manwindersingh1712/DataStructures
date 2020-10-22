package Assignment3;

import java.util.Scanner;

public class Q3_octTObin {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int dec = octTObin(n);
        System.out.println(dec);
    }

    private static int octTObin(int n) {
        int res = 0;
        int power = 1;


        while (n != 0) {

            int a = n % 2;
            res = res + (a * power);
            n = n / 2;
            System.out.println(res + " a: " + a + " power: " + power+ " n: " + n);
            power = power * 10;
        }
        return res;
    }
}
