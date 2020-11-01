package PepCoding.PC4_Strings;

import java.util.Scanner;

public class S1_StringDeclarationBasics {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
//        String word = scrn.next();
//        String line = scrn.nextLine();
//        System.out.println(word);
//        System.out.println(line);

        String s = scrn.nextLine();
        System.out.println(s.charAt(2));

        System.out.println(s.substring(1,4));
    }
}
