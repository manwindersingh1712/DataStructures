package Assignment2;

import java.util.Scanner;

public class Q6_OddEvenSum {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int odd = 0, even = 0;
        int power = 10;
        int num = 0;

        while (n != 0) {
            int a = n % 10;
            num = (num * power) + a;
            n = n / 10;
        }

        while (num != 0) {

            int a = num % 10;
            num = num / 10;
            int b = num % 10;
            num = num / 10;

            odd = odd + a;
            even = even + b;
        }

        System.out.println("Sum of ODD placed digits is " + odd);
        System.out.println("Sum of EVEN placed digits is " + even);

    }
}
