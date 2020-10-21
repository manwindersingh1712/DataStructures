package Assignment2;

import java.util.Scanner;

public class Q1_PrimeOrNot {

    public static void main(String[] args) {

        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        if (checkPrime(n)) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");
        }

    }

    private static boolean checkPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
