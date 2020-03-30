import java.io.*;
import java.util.*;
import java.util.Map; 
import java.util.TreeMap; 

public class Conquest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());

        TreeMap<String, Integer> map = new TreeMap<>(); 

        for (int i = 0; i < x; i++) {
            String text = sc.nextLine();
            text = text.trim();
            if (text.equals(""))
                continue;
            String[] data = text.split(" ");

            if (! map.containsKey(data[0])) {
                map.put(data[0], 0);
            }

            if (map.containsKey(data[0])) {
                map.put(data[0], map.get(data[0]) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}
