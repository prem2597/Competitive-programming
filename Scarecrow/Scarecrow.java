import java.io.*;
import java.util.*;

public class Scarecrow {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        int x = 0;
        for (int i = 0; i < testcases; i++) {
            x = x + 1;
            int size = Integer.parseInt(sc.nextLine());
            String arr = sc.nextLine();
            int count = 0;
            int j = 0;
            while (j < arr.length()) {
                if(arr.charAt(j) == '.') {
                // if arr[j].equals(".") {
                    count = count + 1;
                    j = j + 3;
                } else {
                    j ++;
                }
            }
            System.out.println("Case "+x+": "+count);
        }
    }
}
