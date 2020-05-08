import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean validate(int[] text1, int[] text2) {
        int flag = 0;
        for (int i = 0; i <= 1000000; i++) {
            flag = flag + text1[i] - text2[i];
            if (flag > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            if (x == 0 && y == 0) {
                break;
            }
            int[] text1 = new int[1000001];
            int[] text2 = new int[1000001];
            while(x > 0) {
                String[] data1 = sc.nextLine().split(" ");
                int i = Integer.parseInt(data1[0]);
                int j = Integer.parseInt(data1[1]);
                text1[i]++;
                text2[j]++;
                x--;
            }
            while(y > 0) {
                String[] data2 = sc.nextLine().split(" ");
                int p = Integer.parseInt(data2[0]);
                int q = Integer.parseInt(data2[1]);
                int r = Integer.parseInt(data2[2]);
                for (int i = p; i <= 1000000; i = i + r) {
                    text1[i]++;
                }
                for (int i = q; i <= 1000000; i = i + r) {
                    text2[i]++;
                }
                y--;
            }
            if (validate(text1, text2)) {
                System.out.println("NO CONFLICT");
            } else {
                System.out.println("CONFLICT");
            }
        }
    }
}
