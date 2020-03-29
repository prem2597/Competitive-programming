import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Tex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String out = "";
        boolean flag = false;
        while(sc.hasNextLine()) {
            StringBuffer string = new StringBuffer();
            String x = sc.nextLine();
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == '"') {
                    if (flag) {
                        string.append("''");
                        flag = false;
                    } else {
                        string.append("``");
                        flag = true;
                    }
                }  else {
                    string.append(x.charAt(i));
                }
            }
        System.out.println(string);
        }
    sc.close();
    }
}