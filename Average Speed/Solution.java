import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x;
        double z = 0;
        int h = 0;
        int m = 0;
        int s = 0;
        double distance = 0.0;
        while ((x = br.readLine())!= null) {
            StringTokenizer st = new StringTokenizer(x);
            StringTokenizer st2 = new StringTokenizer(st.nextToken(),":");
            int hour = Integer.parseInt(st2.nextToken());
            int min = Integer.parseInt(st2.nextToken());
            int sec = Integer.parseInt(st2.nextToken());
            
            int p = hour;
            if (hour < h || hour == h && min < m || hour == h && min == m && sec < s) {
                p = p + 24;
            }

            distance = distance + z*((p-h)*3600+(min-m)*60+(sec-s));

            if (st.hasMoreTokens()) {
                z = Integer.parseInt(st.nextToken())/3600.0;
            } else {
                System.out.printf("%s %.2f km\n", x, distance);
            }
            h = hour;
            m = min;
            s = sec;
        }
    }
}