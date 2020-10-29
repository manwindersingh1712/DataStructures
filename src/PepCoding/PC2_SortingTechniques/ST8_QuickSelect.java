package PepCoding.PC2_SortingTechniques;

// Question:
// https://www.youtube.com/watch?v=fnbImb8lo88&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=8

import java.util.Scanner;

public class ST8_QuickSelect {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int k = scrn.nextInt();

        int element = quickSelect(arr, k - 1, 0, arr.length - 1);
        System.out.println(element);

    }

    private static int quickSelect(int[] arr, int k, int lo, int hi) {


        int pi = partition(arr, arr[hi], lo, hi);
        if (pi > k) {
            return quickSelect(arr, k, lo, pi - 1);
        } else if (pi < k) {
            return quickSelect(arr, k, pi + 1, hi);
        } else {
            return arr[pi];
        }

    }


    private static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;

        while (i <= hi) {

            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }

        return j - 1;
    }
}

//8
//8 2 4 6 3 1 7 5
//1
//        1