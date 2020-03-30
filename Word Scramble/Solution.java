import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String data = sc.nextLine();
            String[] arr = data.split(" ");
            for (int i = 0; i < arr.length; i ++) {
                StringBuilder str = new StringBuilder();
                str.append(arr[i]);
                System.out.print(str.reverse() + " ");
            }
            System.out.println();
        }
    }
}