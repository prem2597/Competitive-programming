import java.util.Scanner;
import java.util.Arrays;
public class Transparency {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       int  testCases = Integer.parseInt(sc.nextLine());
        String n;
        Double[] coordinates;
        // int testCases = cases;
        for( int i = 0; i < testCases; i++ ) {
            String blank = sc.nextLine();
            int lines = Integer.parseInt(sc.nextLine());
            coordinates = new Double[2*lines];
            Double[] x1 = new Double[lines];
            Double[] x2= new Double[lines];
            Double[] r= new Double[lines];
            for(int j =0; j< lines; j++) {
                String s = sc.nextLine();
                String[] x_y = s.split(" ");
                coordinates[2*j] = Double.parseDouble(x_y[0]);
                coordinates[2*j+1] = Double.parseDouble(x_y[2]);
                r[j]= Double.parseDouble(x_y[4]);
                Double f1 = Double.parseDouble(x_y[0]);
                Double f2 = Double.parseDouble(x_y[2]);
                if(f1 <= f2) {
                    x1[j] = f1;
                    x2[j] = f2;
                } else {
                    x1[j]= f2;
                    x2[j] = f1;
                }
            }
            String[] sum = new String[2*(lines)+1];
            Arrays.sort(coordinates);
            for(int  k =0; k<= 2*lines; k++) {
                double value = 1.000;
                if(k ==0 || k == 2*lines) {
                    sum[k] = "1.000";
                } else {
                    for(int h =0; h< lines; h++) {
                        if(coordinates[k-1] >= x1[h] && coordinates[k] <= x2[h]) {
                            value = value * r[h];
                        }
                    }
                    sum[k] = String.format("%.3f", value);
                   
                }
            }
            String[] elements = new String[coordinates.length];
            for(int l =0; l <coordinates.length; l++) {
                elements[l] = String.format("%.3f", coordinates[l]);
            }
            System.out.println(sum.length);
            if(lines == 0) {
               
                System.out.println("-inf +inf 1.000" );
                System.out.println(" ");
                break;
            }
            for(int m=0; m <sum.length-1 ; m++) {
                if(m == 0) {
                    System.out.println("-inf" +" " + elements[m] + " " + sum[m] );
                } else if(m >0 && m < sum.length-1){
                    System.out.println(elements[m-1] + " " + elements[m] + " " + sum[m]);
                }
               
            }
            System.out.println(elements[coordinates.length-1] +" " + "+inf" + " " + "1.000" );
            System.out.println(" ");
        }
    }
}