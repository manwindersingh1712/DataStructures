package Assignment2;

import java.util.Scanner;

public class Q2_fibonacci {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        System.out.println(n + "th fibonacci is " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    private static int fibonacciRecursice(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacciRecursice(n - 1) + fibonacciRecursice((n - 2));
    }
}
