package Assingnment4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q11_IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = scrn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = scrn.nextInt();
        }

        ArrayList<Integer> fval = intersection(a1, a2);

        for (int i = 0; i < fval.size(); i++) {

            System.out.print(fval.get(i) + " ");
        }

    }

    private static ArrayList<Integer> intersection(int[] a1, int[] a2) {
        ArrayList<Integer> val = new ArrayList<>();

        Arrays.sort(a1);
        Arrays.sort(a2);

        int i = 0, j = 0;

        while (i < a1.length && j < a2.length) {

            if (a1[i] == a2[j]) {
                val.add(a1[i]);
                i++;
                j++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return val;
    }
}

//Output for:
//7
//1 2 3 1 2 4 1
//2 1 3 1 5 2 2
//        1 1 2 2 3