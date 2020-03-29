import java.io.*;
import java.util.*;

public class Allinall {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            // if (data[0].length() > data[1].length()) {
            //     System.out.println("No");
            //     return;
            // }
            int count = 0;
            for (int i = 0; i < data[1].length(); i++) {
                if (data[1].charAt(i) == data[0].charAt(count)) {
                    count ++;
                }
                if (count == data[0].length()) {
                    System.out.println("Yes");
                    // return;
                    i = data[1].length() + 1;
                }
                if (i == data[1].length() - 1) {
                    if (count != data[0].length()) {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}