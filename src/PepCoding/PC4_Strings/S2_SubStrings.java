package PepCoding.PC4_Strings;

import java.util.Scanner;

public class S2_SubStrings {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        String str = scrn.next();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
