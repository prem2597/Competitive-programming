import java.io.*;
import java.util.Arrays;
import java.util.*;

public class Shopolic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < x; i ++) {
            int size = Integer.parseInt(sc.nextLine());
            int[] arr = new int[size];
            String[] data = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++ ) {
                arr[j] = Integer.parseInt(data[j]);
            }
            Arrays.sort(arr);
            int sum = 0;
            for (int j = arr.length - 3; j >= 0; j = j - 3 ) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}