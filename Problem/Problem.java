import java.io.*;
import java.util.*;

public class Problem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++) {
            String data = sc.nextLine();
            String[] text1 = data.split("[+]");
            long minSum = 0;
            for ( int j = 0; j < text1.length; j ++) {
                String[] minData = text1[j].split("[*]");
                long mul = 1;
                for ( int k = 0; k < minData.length; k ++) {
                    mul = mul * Long.parseLong(minData[k]);
                }
                minSum = minSum + mul;
            }
            String[] text2 = data.split("[*]");
            long maxSum = 1;
            for ( int j = 0; j < text2.length; j ++) {
                String[] maxData = text2[j].split("[+]");
                long add = 0;
                for ( int k = 0; k < maxData.length; k ++) {
                    add = add + Long.parseLong(maxData[k]);
                }
                maxSum = maxSum * add;
            }
            System.out.println("The maximum and minimum are "+ maxSum +" and "+ minSum +".");
        }
    }
}
