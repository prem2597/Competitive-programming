import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Scanner;

public class Decadarywatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            int len = data.length();
            int n = 4;
            int temp = 0;
            int size = len/n;
            String[] text =  new String[n];
            for (int i = 0; i < len; i = i + size) {
                String x = data.substring(i, i + size);
                text[temp] = x;
                temp ++;
            }
            int h = Integer.parseInt(text[0]);
            int m = Integer.parseInt(text[1]);
            int s = Integer.parseInt(text[2]);
            int c = Integer.parseInt(text[3]);
            // System.out.println(h);
            // System.out.println(m);
            // System.out.println(s);
            // System.out.println(c);
            int dummy = h * 60 * 60 * 100 + m * 60 * 100 + s * 100 + c;
            double result = ((double) dummy * 125) / 108;
            System.out.printf("%07d\n", (int)result);
        }
    }
}