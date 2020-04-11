import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Blitz {
    public static class Sorter implements Comparator<String> {
        public int compare(String x, String y) {
            if (x.length() != y.length()) {
                return x.length() - y.length();
            } else {
                return x.compareTo(y);
            }
        }
    }
    public static void result(int i, int j, String s, String[] text, HashSet<String> set1) {
        s = s + text[i].charAt(j);
        for (int y = i - 1; y <= i+1; y++) {
            for (int x = j - 1; x <= j+1; x++) {
                if (x >= 0 && y >= 0 && y < text.length && x <text[y].length() && text[y].charAt(x) > text[i].charAt(j)) {
                    result(y, x, s, text, set1);
                }
            }
        }
        if (s.length() >= 3) {
            set1.add(s);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testcases; i++) {
            HashSet<String> set1 = new HashSet<String>();
            TreeSet<String> set2 = new TreeSet<String>(new Sorter());
            sc.nextLine();
            int size = Integer.parseInt(sc.nextLine());
            String[] text = new String[size];
            for (int j = 0; j < size; j++) {
                text[j] = sc.nextLine();
            }
            String x = "";
            for ( int j = 0; j < text.length; j++) {
                for (int k = 0; k < text[j].length(); k++) {
                    result(j, k, x, text, set1);
                }
            }
            for (String h : set1) {
                set2.add(h);
            }
            for (String h : set2) {
                System.out.println(h);
            }
            System.out.println();
        }
    }
}
