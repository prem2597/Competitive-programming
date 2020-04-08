import java.io.*;
import java.util.*;

public class TourDe {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(" ");
            if (data.length == 1) {
                break;
            }
            int front = Integer.parseInt(data[0]);
            int rear = Integer.parseInt(data[1]);
            String[] text1 = sc.nextLine().split(" ");
            String[] text2 = sc.nextLine().split(" ");
            int[] frontteeth = new int[front];
            int[] rearteeth = new int[rear];
            for (int i = 0; i < front; i++) {
                frontteeth[i] = Integer.parseInt(text1[i]); 
            }
            for (int j = 0; j < rear; j++) {
                rearteeth[j] = Integer.parseInt(text2[j]);
            }
            Double[] result = new Double[rear*front];
            int size = 0;
            for (int i = 0; i < frontteeth.length; i++) {
                for (int j = 0; j < rearteeth.length; j++) {
                    result[size++] = rearteeth[j]*1.0/frontteeth[i];
                }
            }
            Arrays.sort(result);
            double maximum = 0;
            for (int k = 0; k < result.length-1; k++) {
                maximum = Math.max(maximum, result[k+1]/result[k]);
            }
            System.out.printf("%.2f", maximum);
            System.out.println();
        }
    }
}