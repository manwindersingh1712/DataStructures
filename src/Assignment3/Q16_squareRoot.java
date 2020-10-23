package Assignment3;

import java.util.Scanner;

public class Q16_squareRoot {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        System.out.println((int) Math.floor(Math.sqrt(n)));
    }
}
