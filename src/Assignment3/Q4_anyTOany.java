package Assignment3;

import java.util.Scanner;

public class Q4_anyTOany {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int sb = scrn.nextInt();
        int db = scrn.nextInt();

        int dec = anyTOdec(sb, n);
        int res = decTOany(db, dec);
        System.out.println(res);
    }

    private static int decTOany(int db, int n) {
        int res = 0;
        int power = 1;

        while (n != 0) {
            int a = n % db;
            n = n / db;
            res = res + a * power;
            power = power * 10;

        }
        return res;
    }


    private static int anyTOdec(int sb, int n) {
        int res = 0;
        int power = 1;

        while (n != 0) {
            int a = n % 10;
            res = res + a * power;
            power = power * sb;
            n = n / 10;
        }
        return res;
    }
}
