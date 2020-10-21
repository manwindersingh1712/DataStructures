package Assignment2;

import java.util.Scanner;

public class Q8_Pattern2 {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                } else if (j == i) {
                    System.out.print(i + 1 + " ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

//Output for  :5s
//        1
//        2 2
//        3 0 3
//        4 0 0 4
//        5 0 0 0 5
