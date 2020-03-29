import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Problem {
    
    public static int range(int i, int j) {
        int count = 0;
        int z = 0;
        for (int v = i; v<= j; v++) {
            int m = v;
            count = 0;
            while ( m != 1) {
                if (m % 2 != 0) {
                    m = 3*m + 1;
                    // count = count + 1;
                } else if (m %2 == 0) {
                    m = m/2;
                    // count = count + 1;
                }
                count = count + 1;
            }
            if ( count > z) {
                z = count;
            }
            // System.out.print(z);
        }
        return z + 1;
    }

    public static void main(String[] args) {
        int i,j;
        int count;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            String[] x = s.split(" ");
            i = Integer.parseInt(x[0]);
            j = Integer.parseInt(x[1]);
            // int count = 0;
            // int z = 0;
//             for (int m = i; m <= j; m++) {
                
//             }
            if (i < j) {
                System.out.println(i+" "+j+" "+range(i, j));
            } else if (j < i) {
                System.out.println(i+" "+j+" "+range(j, i));
            } else {
                System.out.println(j+" "+i+" "+range(i, j));
            }
        }
    }
}