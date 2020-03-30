import java.io.*;
import java.util.*;

public class Coincollector {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[] text;
        int testCases = Integer.parseInt(sc.nextLine());
        for ( int i = 0 ; i < testCases ; i++) {
            int size = Integer.parseInt(sc.nextLine());
            text = new int[size];
            String[] data = sc.nextLine().split(" ");
            int sum = 0;
            int count = 1;
            for (int j = 0; j < size; j++) {
                text[j]=Integer.parseInt(data[j]);
                if (j > 0) {
                    if (sum >= text[j]) {
                        sum -= text[j-1];
                        sum += text[j];
                    } else {
                        sum += text[j];
                        count++;
                    }
                } else {
                    sum = text[j];
                }
            }
            System.out.println(count);
        }
    }
}