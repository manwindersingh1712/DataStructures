package PepCoding.SortingTechniques;

import java.util.Scanner;

public class ST9_CountSort {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        countSort(arr, min, max);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void countSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] frequencyArray = new int[range];
//        System.out.println(max + " " + min + " " + range);

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
//            System.out.println("arr: " + arr[i] + " ,min: " + min + " ,idx: " + idx + " farray: " + frequencyArray[idx]);
            frequencyArray[idx]++;
        }
// making frequency array a prefix sum array
        for (int i = 1; i < range; i++) {
            frequencyArray[i] = frequencyArray[i - 1] + frequencyArray[i];
        }

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int position = frequencyArray[arr[i] - min];
            int idx = position - 1;

            ans[idx] = arr[i];
            frequencyArray[arr[i] - min]--;

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

    }
}

//15
//        9 6 3 5 3 4 3 9 6 4 9 5 8 2 9
//        2 3 3 3 4 4 5 5 6 6 8 9 9 9 9