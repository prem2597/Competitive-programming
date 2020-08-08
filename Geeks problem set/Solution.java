import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
        // Write your code here
        for(int i = 0; i < upRight.size(); i++) {
            System.out.println(upRight.get(i));
        }
        
        return 0;
    }

}

public class Solution {
    public static long countMax(List<String> upRight) {
        // Write your code here
        int[] a1 = new int[2 * upRight.size()];
        int z = 0;
        for(int i = 0; i < upRight.size(); i++) {
            String[] x = upRight.get(i).split(" ");
            a1[z++] = Integer.parseInt(x[0]);
            a1[z++] = Integer.parseInt(x[1]);

        }
        Arrays.sort(a1);
        int[][] res = new int[a1[a1.length-1]][a1[a1.length-1]];
        for(int[] row : res) {
            Arrays.fill(row, 0);
        }
        for (int[] row : res) 
            System.out.println(Arrays.toString(row)); 
        System.out.println("------------------");
        for(int i = 0; i < upRight.size(); i++) {
            String[] x = upRight.get(i).split(" ");
            for(int j = 0; j < Integer.parseInt(x[0]); j++) {
                for(int k = 0; k < Integer.parseInt(x[1]); k++) {
                    res[j][k] = res[j][k] + 1;
                }
            }
        }
        for (int[] row : res) 
            System.out.println(Arrays.toString(row));
        long count = 0;
        int maxValue = res[0][0];
        for (int j = 0; j < res.length; j++) {
            for (int i = 0; i < res[j].length; i++) {
                if (res[j][i] > maxValue) {
                    maxValue = res[j][i];
                    count = 1;
                }
                if (res[j][i] == maxValue) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>(3);
        list.add("2 3");
        list.add("3 7");
        list.add("4 1");
        long result = countMax(list);
        System.out.println(result);
    }
}
