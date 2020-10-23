package Assignment3;

import java.util.Scanner;

public class Q13_Power {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int x = scrn.nextInt();
        int n = scrn.nextInt();

        System.out.println((int) Math.pow(x, n));
    }
}
