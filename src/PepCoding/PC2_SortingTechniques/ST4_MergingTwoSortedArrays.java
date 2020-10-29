package PepCoding.PC2_SortingTechniques;

import java.util.Scanner;

public class ST4_MergingTwoSortedArrays {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = scrn.nextInt();
        }

        int m = scrn.nextInt();
        int[] a2 = new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = scrn.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int[] fArr = new int[n + m];

        while (i < n && j < m) {

            if (a1[i] < a2[j]) {
                fArr[k] = a1[i];
                k++;
                i++;
            } else if (a1[i] > a2[j]) {
                fArr[k] = a2[j];
                k++;
                j++;
            }
        }

        while (j < m) {
            fArr[k] = a2[j];
            j++;
            k++;
        }
        while (i < n) {
            fArr[k] = a1[i];
            i++;
            k++;
        }

        for (i = 0; i < k; i++) {
            System.out.print(fArr[i] + " ");
        }

    }


}
