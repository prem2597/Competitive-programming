import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Maximum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int x = Integer.parseInt(sc.nextLine());
            if (x == 0) {
                return;
            }
            int[] arr = new int[x];
            int count = 0;
            for (int i = 0; i < x; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            // Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]!= 0) {
                    System.out.print(arr[j]+" ");
                } else {
                    count = count + 1;
                }
            }
            if (count == arr.length) {
                System.out.println("0");
            } else {
                System.out.println();
            }
            
            // System.out.println(arr[0]+" "+arr[1]);
        }
    }
}