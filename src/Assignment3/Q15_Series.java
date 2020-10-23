package Assignment3;

import java.util.Scanner;

public class Q15_Series {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n1 = scrn.nextInt();
        int n2 = scrn.nextInt();

        printSeries(n1, n2);

    }

    private static void printSeries(int n1, int n2) {
        for (int i = 1; i < n1; i++) {
            int check = (3 * i) + 2;
            if (check % n2 != 0) {
                System.out.println(check);
            }
        }
    }
}
