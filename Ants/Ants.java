import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Ants {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < testCases; i ++) {
            String data = sc.nextLine();
            String[] text = data.split(" ");
            int size = Integer.parseInt(text[0]);
            int range = Integer.parseInt(text[1]);
            String data2 = sc.nextLine();
            String[] text2 = data2.split(" ");
            int[] arr = new int[range];
            int[] min = new int[range];
            int[] max = new int[range];
            for (int j = 0; j < range; j ++) {
                arr[j] = Integer.parseInt(text2[j]);
                int x = size - arr[j];
                int y = arr[j] - 0;
                if (x > y) {
                    max[j] = x;
                    min[j] = y;
                } else {
                    max[j] = y;
                    min[j] = x;
                }

            }
            Arrays.sort(min);
            Arrays.sort(max);
            System.out.println(min[min.length-1]+" "+max[max.length-1]);
        }
    }
}