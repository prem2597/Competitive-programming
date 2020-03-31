import java.io.*;
import java.util.*;

public class Division {

    public static boolean unique(String s) {
        int flag = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            double test = Double.parseDouble(sc.nextLine());
            if (test == 0) {
                return;
            }
            boolean m = false;
            for (int x = 01234; x <= 98765; x++) {
                // if (x == 26970) {
                //     System.out.print(x+" ");
                // }
                String s = Integer.toString(x);
                if (unique(s) && s.length() == 5) {
                    double d = x/test;
                    StringBuilder str = new StringBuilder();
                    if (x == 26970) {
                        // System.out.println("True");
                        // System.out.print(d+"-----------d ");
                    }

                    if ((int)d == d) {
                        String a = Integer.toString(x);
                        String b = Integer.toString((int)d);
                        if ((a.length() + b.length()) == 9) {
                            str.append(Integer.toString(x));
                            str.append("0");
                            str.append(Integer.toString((int)d));
                            String q = str.toString();
                            if (unique(q) && q.length() == 10) {
                                System.out.println(x + " / "+ "0"+(int)d+" = "+(int)test);
                                m = true;
                            }
                        } else {
                            str.append(Integer.toString(x));
                            // str.append("0");
                            str.append(Integer.toString((int)d));
                            String q = str.toString();
                            if (unique(q) && q.length() == 10) {
                                System.out.println(x + " / "+(int)d+" = "+(int)test);
                                m = true;
                            }
                        }
                    }
                }
            }
            if (m == false) {
                System.out.println("There are no solutions for "+(int)test+".");
            }
            System.out.println();
        }
    }
}
