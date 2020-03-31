import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Numeralogist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String vowels = "AUEOI";
        String consonants = "JSBKTCLDMVNWFXGPYHQZR";
        while (sc.hasNextLine()) {
            int x =Integer.parseInt(sc.nextLine());
            if (x == 0) {
                return;
            }
            int count = 0;
            for (int j = 0; j < x; j++) {
                count ++;
                int y =Integer.parseInt(sc.nextLine());
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int consonantscount = 0;
                int vowelscount = 0;
                for (int i = 1; i <= y; i++) {
                    if (i%2 != 0) {
                        sb.append(vowels.charAt(vowelscount/21));
                        vowelscount++;
                    } else {
                        sb2.append(consonants.charAt(consonantscount/5));
                        consonantscount++;
                    }
                }
                String str = sb.toString();
                char[] arr = str.toCharArray();
                Arrays.sort(arr); 
                String str2 = sb2.toString();
                char[] arr2 = str2.toCharArray();
                Arrays.sort(arr2);
                StringBuilder sb3 = new StringBuilder();
                int arrcount = 0;
                int arrcount2 = 0;
                for (int i = 1; i <= y; i++) {
                    if (i%2 != 0) {
                        sb3.append(arr[arrcount++]);
                    } else {
                        sb3.append(arr2[arrcount2++]);
                    }
                }
                System.out.println("Case "+ count +": "+sb3.toString());
            }
        }
    }
}
