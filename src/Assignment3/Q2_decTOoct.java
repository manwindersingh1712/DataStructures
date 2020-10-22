package Assignment3;

import java.util.Scanner;

public class Q2_decTOoct {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int dec = decTOoct(n);
        System.out.println(dec);
    }

    private static int decTOoct(int n) {
        int res = 0;
        int power = 1;


        while (n != 0) {

            int a = n % 8;
            res = res + (a * power);
            n = n / 8;
//            System.out.println(res + " a: " + a + " power:" + power); to chechk the valuessss of it
            power = power * 10;
        }
        return res;
    }
}
