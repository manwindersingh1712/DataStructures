package Assignment2;

import java.util.Scanner;

public class Q10_Pattern4 {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}

//Out for : 4
//        0
//        1 1
//        2 3 5
//        8 13 21 34
