package PepCoding.SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class S14_TargetSumPair {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        int target = scrn.nextInt();

        targetSum(arr, target);
    }

    private static void targetSum(int[] arr, int target) {
        int l = 0;
        int h = arr.length - 1;
        Arrays.sort(arr);

        while (l <= h) {
            if (arr[l] + arr[h] == target) {
                System.out.println(arr[l] + " ," + arr[h]);
                l++;
                h--;
            } else if (arr[l] + arr[h] > target) {
                h--;
            } else {
                l++;
            }
        }

    }
}
