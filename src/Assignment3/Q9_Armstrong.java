package Assignment3;

import java.util.Scanner;

public class Q9_Armstrong {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        boolean arm = isArmstrong(n);
        System.out.println(arm);
    }

    private static boolean isArmstrong(int n) {

        int val = findArmstrong(n);
        if (val == n) {
            System.out.println(val);
            return true;
        }
        return false;
    }

    private static int findArmstrong(int n) {
        int res = 0;
        int len = Integer.toString(n).length();

        while (n != 0) {
            res = (int) (res + Math.pow((n % 10), len));
            n = n / 10;
        }

        return res;
    }
}
