package Assignment2;

import java.util.Scanner;

public class Q4_PrimeTillN {

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();

        for (int i = 2; i <=n; i++) {
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static boolean checkPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
