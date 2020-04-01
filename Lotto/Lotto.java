import java.io.*;
import java.util.*;

public class Lotto {

    public static void possiblities(int[] arr, int[] result, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(result[j]+" ");
            }
            System.out.println("");
            return;
        }
        for (int k = start; k <= end && end-k+1 >= (r-index); k++) {
            result[index] = arr[k];
            possiblities(arr, result, k+1, end, index+1, r);
        }
    }
    public static void combinations(int[] arr, int l, int r) {
        int[] result = new int[r];
        possiblities(arr, result, 0, l-1, 0, r);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            int range = Integer.parseInt(data[0]);
            if (range == 0) {
                return;
            } else {
                int[] arr = new int[range];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(data[i+1]);
                }
                int r = 6;
                int l = arr.length;
                combinations(arr, l, r);
            }
            System.out.println();
        }
    }
}