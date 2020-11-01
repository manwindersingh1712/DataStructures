package PepCoding.PC4_Strings;

import java.util.Scanner;

public class S3_AdditionOfStrings {
    public static void main(String[] args) {
        String s1 = "Hell";
        s1 += 'o';
        String s2 = "World";

        String s3 = s1 + " " + s2;

        System.out.println(10 + 20 + s3);
        System.out.println(s3 + 10 + 20);//evaluation is been done from left to right
    }
}
