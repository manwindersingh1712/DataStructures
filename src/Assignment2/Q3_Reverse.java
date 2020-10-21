package Assignment2;

import java.util.Scanner;

public class Q3_Reverse {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int power = 10;
        int num = 0;

        while (n != 0) {
            int a = n % 10;
            num = (num * power) + a;
            n = n / 10;
        }

        System.out.println(num);
    }
}
