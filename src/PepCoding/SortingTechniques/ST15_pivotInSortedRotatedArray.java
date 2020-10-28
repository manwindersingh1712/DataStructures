package PepCoding.SortingTechniques;
//https://www.youtube.com/watch?v=vF7gk4iaklA&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=15
import java.util.Scanner;

public class ST15_pivotInSortedRotatedArray {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }

        System.out.println(pivot(arr));
    }

    private static int pivot(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return arr[lo];
    }
}
