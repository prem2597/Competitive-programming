import java.io.*;
import java.util.*;

public class Map {

    static class Mapmaker {

        String data;
        int base;
        int size;
        int pair;
        int[] lower;
        int[] upper;
    
    
        Mapmaker(String n1, int b1, int s1, int numP1, int[] l1, int[] u1) {
            this.data = n1;
            this.base = b1;
            this.size = s1;
            this.pair = numP1;
            this.lower = l1;
            this.upper = u1;
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Hashtable<String, Mapmaker> hash = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] in = str.split(" ");
        int[] input = new int[2];
        for (int i = 0; i < 2; i++) {
            input[i] = Integer.parseInt(in[i]);
        }
        int m = input[0];
        int n = input[1];
        for(int i = 0; i < m; i++) {
            String n2 = sc.next();
            int baseaddress = Integer.parseInt(sc.next());
            int size1 = Integer.parseInt(sc.next());
            int numP2 = Integer.parseInt(sc.next());
            int[] lower = new int[numP2];
            int l = 0, u = 0;
            int[] upper = new int[numP2];
            for (int j = 0; j < 2 * numP2; j++) {
                if (j % 2 == 0) {
                    int p = Integer.parseInt(sc.next());
                    lower[l++] = p;
                } else {
                    int p1 = Integer.parseInt(sc.next());
                    upper[u++] = p1;
                }
            }
            Mapmaker m1 = new Mapmaker(n2, baseaddress, size1, numP2, lower, upper);
            hash.put(n2, m1);
        }
        sc.nextLine();
        
        for (int j = 0; j < n; j++) {
            String testCases = sc.nextLine();
            String[] test = testCases.split(" ");
            int[] testCase = new int[test.length];
            for (int i = 1; i < testCase.length; i++) {
                testCase[i] = Integer.parseInt(test[i]);
            }
            int[] c = new int[hash.get(test[0]).pair + 1];
            int[] u = hash.get(test[0]).upper;
            int[] l = hash.get(test[0]).lower;
            c[hash.get(test[0]).pair] = hash.get(test[0]).size;
            for(int k = hash.get(test[0]).pair - 1; k > 0 ; k--) {
                c[k] = c[k + 1] * (u[k] - l[k] + 1);
            }
            int csum = 0;
            for(int s = 1; s < c.length; s++) {
                csum += c[s] * l[s - 1];
            }
            c[0] = hash.get(test[0]).base - csum;
            int result = 0;
            for (int p = 1; p < testCase.length; p++) {
                result += testCase[p] * c[p];
            }
            result += c[0];
            System.out.print(test[0] + "[");
            for(int i = 1; i < testCase.length; i++) {
                if(i == testCase.length - 1) {
                    System.out.print(testCase[i] + "] = ");
                } else {
                    System.out.print(testCase[i] + ", ");
                }
            }
            System.out.print(result);
            System.out.println();
        }
    }
}
