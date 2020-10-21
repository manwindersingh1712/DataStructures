package Assignment2;

import java.util.Scanner;

public class Q7_Pattern1 {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int p=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
//
//Output for : 4
//        1
//        2 3
//        4 5 6
//        7 8 9 10
