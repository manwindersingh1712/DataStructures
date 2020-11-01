package PepCoding.PC4_Strings;

import java.util.Scanner;

public class S7_StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        System.out.println(sb.charAt(1));   //get

        sb.setCharAt(2, 'y');     //update
        System.out.println(sb);

        sb.insert(2, 'y');         //insert
        System.out.println(sb);

        sb.append('s');                     //append
        System.out.println(sb);

        System.out.println(sb.length());    //length

        Scanner scrn = new Scanner(System.in); //taking input
        String s = scrn.next();
        StringBuilder sb2 = new StringBuilder(s);
    }
}
