package Assignment3;

import java.util.Scanner;

public class Q12_LCM {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n1 = scrn.nextInt();
        int n2 = scrn.nextInt();

        int lcm = lcm(n1, n2);

        System.out.println(lcm);
    }

    private static int lcm(int n1, int n2) {

        int res = 1;
        int divider = 2;

        while (n1 >= divider || n2 >= divider) {

            if (n1 % divider == 0 && n2 % divider == 0) {

                res = res * divider;
                n1 = n1 / divider;
                n2 = n2 / divider;
            } else if (n1 % divider == 0) {

                res = res * divider;
                n1 = n1 / divider;
            } else if (n2 % divider == 0) {

                res = res * divider;
                n2 = n2 / divider;
            } else {
                divider++;
            }
        }

//        System.out.println(n1 + "," + n2 + "," + divider);


        return res;
    }
}
