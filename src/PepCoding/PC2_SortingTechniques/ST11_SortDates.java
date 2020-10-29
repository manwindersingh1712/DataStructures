package PepCoding.PC2_SortingTechniques;

import java.util.Scanner;

public class ST11_SortDates {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scrn.next();
            arr[i] = str;
        }

        sortDates(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void sortDates(String[] arr) {

        countSort(arr, 1000000, 100, 32); //days
        countSort(arr, 10000, 100, 13); //months
        countSort(arr, 1, 10000, 2501);  //years 2501 because we are given that year cannot exceed 2500
    }

    public static void countSort(String[] arr, int exp, int mod, int range) {

        String[] ans = new String[arr.length];
        int[] frequencyArray = new int[range];

        //making a frquency array
        for (int i = 0; i < arr.length; i++) {
            int idx = Integer.parseInt(arr[i], 10) / exp % mod;
            frequencyArray[idx]++;
        }
        // making frequency array a prefix sum array
        for (int i = 1; i < frequencyArray.length; i++) {
            frequencyArray[i] = frequencyArray[i - 1] + frequencyArray[i];
        }
        //stable sorting
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = frequencyArray[Integer.parseInt(arr[i], 10) / exp % mod] - 1;
            ans[idx] = arr[i];
            frequencyArray[Integer.parseInt(arr[i], 10) / exp % mod]--;
        }
        //copying
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}
//5
//        12041996
//        20101996
//        05061997
//        12041989
//        11081987

//Output: 11081987
//        12041989
//        12041996
//        20101996
//        05061997