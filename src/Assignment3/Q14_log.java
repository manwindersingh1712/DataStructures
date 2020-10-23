package Assignment3;

import java.util.Scanner;

public class Q14_log {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int x = scrn.nextInt();
        int n = scrn.nextInt();

        int val = log(x, n);

        System.out.println(val);
    }

    private static int log(int x, int n) {
        int a = 0;
        int counter = 1;
        for (int i = 0; counter != x; i++) {
//            System.out.println(i + ":" + n);
            counter = counter * n;
            a++;
        }

        return a;
    }
}
