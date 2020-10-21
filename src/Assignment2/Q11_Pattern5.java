package Assignment2;

import java.util.Scanner;

public class Q11_Pattern5 {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int spaces = n / 2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
//            System.out.println(spaces+","+stars);  to check our pattern
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int k=0;k<stars;k++){
                System.out.print("*");
            }
            System.out.println();

            if(i < n/2){
                spaces--;
                stars+=2;
            }else{
                spaces++;
                stars-=2;
            }

        }

}
}

//Output For: 7
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *
