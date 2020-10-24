package PepCoding.Array;

import java.util.Scanner;

// Question:
// https://www.youtube.com/watch?v=vk8sfizNtsY&list=PL-Jc9J83PIiHOV7lm2uSw4ZiVsIRsGS6r&index=37
public class A11_subsetOfArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    set = "- " + set;
                } else {
                    set = arr[j] + " " + set;
                }
            }
            System.out.println(set);
        }
    }
}


//        ---
//        --3
//        -2-
//        -23
//        1--
//        1-3
//        12-
//        123
