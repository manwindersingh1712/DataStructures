package Assignment2;

import java.util.Scanner;

public class Q13_Pattern7 {
    public static void main(String[] args) {
        Scanner scrn=new Scanner(System.in);
        int n=scrn.nextInt();
        int stars=1;
        int spaces=n-1;


        for(int i=0;i<n;i++){
            int val =i+1;
            for (int k = 0; k < spaces; k++) {
                System.out.print("   ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print(" "+val+" ");
                if(k<i){
                    val++;
                }else {
                    val--;
                }
            }
            System.out.println();

                spaces--;
                stars+=2;

        }
    }
}

//Output For: 4
//                 1
//              2  3  2
//           3  4  5  4  3
//        4  5  6  7  6  5  4

