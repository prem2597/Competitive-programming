import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fact = new long[21];
        fact[0] = 1;
        for ( int i = 1; i < fact.length; i++) {
            fact[i] = i * fact[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < x; i++) {
            String str = sc.nextLine();
            long l = Long.parseLong(sc.nextLine());
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                long number = fact[arr.length - j - 1];
                int val = (int) (l/number);
                sb.append(arr[val]);
                for (int k = val + 1; k < arr.length; k ++) {
                    arr[k - 1] = arr[k];
                }
                l = l%number;
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
