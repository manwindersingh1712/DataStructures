package Assignment2;

import java.util.Scanner;

public class Q5_fibonacciLessThanN {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int a = 0;
        int b = 1;
        int c;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(a + " " + b);
        } else {
            System.out.print(a + " " + b);
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(" " + c);
            }
        }

    }
}
