package PepCoding.SortingTechniques;

//https://www.youtube.com/watch?v=jFrUwjx4eoA&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=12

import java.util.Scanner;

public class ST12_Sort01 {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        sort01(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort01(int[] arr) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }
        }
    }
}


//Input:
//        8
//        1 0 0 1 1 0 1  0
//Output:
//        0 0 0 0 1 1 1 1