package Assignment3;

import java.util.Scanner;

public class Q10_AllArmstrong {
    public static void main(String[] args) {

        Scanner scrn = new Scanner(System.in);
        int n1 = scrn.nextInt();
        int n2 = scrn.nextInt();

        for (int i = n1; i < n2; i++) {
            if (isArmstrong(i)) {
                System.out.println(findArmstrong(i));
            }
        }
    }

    private static boolean isArmstrong(int n) {

        int val = findArmstrong(n);
        if (val == n) {
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
