package Assignment3;

import java.util.Scanner;

public class Q11_GCD {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n1 = scrn.nextInt();
        int n2 = scrn.nextInt();

        int gcd = gcd(n1, n2);

        System.out.println(gcd);
    }

    private static int gcd(int n1, int n2) {
        int val = 1;
        int divider = 2;

        while (divider < n1 && divider < n2) {

            if (n1 % divider == 0 && n2 % divider == 0) {
                val = val * divider;
                System.out.println("in if true");
                n1 = n1 / divider;
                n2 = n2 / divider;
            } else {
                divider++;
            }
        }


        return val;
    }
}
