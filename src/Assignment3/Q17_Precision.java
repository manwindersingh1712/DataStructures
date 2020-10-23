package Assignment3;

import java.util.Scanner;

public class Q17_Precision {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int p = scrn.nextInt();
//        String.format("%.20f", a); this is also a way
        String fVal = String.format("%." + p + "f", Math.sqrt(n));
        System.out.println(fVal);
    }
}
