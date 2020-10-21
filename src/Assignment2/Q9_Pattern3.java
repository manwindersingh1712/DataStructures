package Assignment2;

import java.util.Scanner;

public class Q9_Pattern3 {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        for (int i = 0; i < n; i++) {

            int val = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(val+" ");
                val=val*(i-j);
                val=val/(j+1);
            }
            System.out.println();

        }
    }
}
