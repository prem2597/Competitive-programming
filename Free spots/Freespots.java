import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Freespots {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            if (data.equals("0 0 0")) {
                return;
            }
            StringTokenizer st = new StringTokenizer(data);
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int set = w * h;
            boolean [][] text = new boolean [w][h];

            for (int i = 0 ; i < n; i++) {
                String data2 = sc.nextLine();
                st = new StringTokenizer(data2);
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                
                for (int x = Math.min(x1,x2); x <= Math.max(x1,x2); x++) {
                    for (int y=Math.min(y1,y2); y<=Math.max(y1,y2); y++) {
                        if (!text[x-1][y-1]) {
                            text[x-1][y-1] = true;
                            set--;
                        }
                    }
                }
            }
            
            if (set == 0) {
                System.out.println("There is no empty spots.");
            } else if (set == 1) {
                System.out.println("There is one empty spot.");
            } else {
                System.out.println("There are "+ set +" empty spots.");
            }
            String raw = sc.nextLine();
        }
    }
}