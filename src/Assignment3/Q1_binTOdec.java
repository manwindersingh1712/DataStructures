package Assignment3;

import java.util.Scanner;

public class Q1_binTOdec {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int dec = binTOdec(n);
        System.out.println(dec);
    }

    private static int binTOdec(int n) {
        int res = 0;
        int power = 1;


        while (n != 0) {

            int a = n % 10;
            res = res + (a * power);
            n = n / 10;
//            System.out.println(res + " a: " + a + " power:" + power); to chechk the valuessss of it
            power = power * 2;
        }
        return res;
    }
}
