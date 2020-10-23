package Assignment3;

import java.util.Scanner;

public class Q20_Calculator {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n1 = scrn.nextInt();
        int n2 = scrn.nextInt();
        char c = scrn.next().charAt(0);

        System.out.println(calculator(n1, n2, c));
    }

    private static int calculator(int a, int b, char c) {
        if (c == '+') {
            return a + b;
        }
        if (c == '-') {
            return a - b;
        }
        if (c == '*') {
            return a * b;
        }
        if (c == '%') {
            return a % b;
        }
        if (c == '/') {
            return a / b;
        }

        return -1;
    }
}
