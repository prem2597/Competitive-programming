import java.io.*;
import java.util.*;

public class Queens {
    public static int flag;
    public static boolean check(int column,int i, int[] numberOfRows) {
        for (int k = 1; k < column; k ++) {
            if (numberOfRows[k] == i || Math.abs(i - numberOfRows[k]) == Math.abs(column - k)) {
                return false;
            }
        }
        return true;
    }
    public static void display(int[] numberOfRows) {
        flag = flag + 1;
        System.out.print(" " + flag + "      ");
        for(int i = 1; i < 9; i++) {
            System.out.print(numberOfRows[i] + " ");
        }
        System.out.println();
    }
    public static void status(int[] numberOfRows, int column, int pos1, int pos2) {
        if (column == 9) {
            if(numberOfRows[pos2] == pos1) {
                display(numberOfRows);
            }
            return;
        }
        for (int j = 1; j <= 8; j++) {
            if(check(column, j, numberOfRows)) {
                numberOfRows[column] = j;
                status(numberOfRows, column + 1, pos1, pos2);
            }
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testcases = Integer.parseInt(sc.nextLine());
        int[] numberOfRows = new int[9];
        for (int i = 0; i < testcases; i++) {
            String text = sc.nextLine();
            String[] data = sc.nextLine().split(" ");
            int pos1 = Integer.parseInt(data[0]);
            int pos2 = Integer.parseInt(data[1]);
            flag = 0;
            int initial = 1;
            System.out.println("SOLN       COLUMN");
            System.out.println(" #      1 2 3 4 5 6 7 8\n");
            status(numberOfRows, initial, pos1, pos2);
        }
    }
}