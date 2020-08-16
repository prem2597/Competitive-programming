import java.util.*;

/**
 * @author Prem
 */
class Solution {
	public static void main(String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cases; i++) {
		    String[] size = sc.nextLine().split(" ");
		    int size1 = Integer.parseInt(size[0]);
		    String[] d1 = sc.nextLine().split(" ");
		    String[] d2 = sc.nextLine().split(" ");
		    int[] a1 = new int[size1];
		    int index = 0;
		    Map<Integer,Integer> h1 = new HashMap();
		    for (int j = 0; j < d1.length; j++) {
		        int count = 0;
		        if(h1.get(Integer.parseInt(d1[j])) == null) {
		            count = 0;
		        } else {
		            count = h1.get(Integer.parseInt(d1[j]));
		        }
		        h1.put(Integer.parseInt(d1[j]), count + 1);
		    }
		    for (int j = 0; j < d2.length; j++) {
		        if (h1.get(Integer.parseInt(d2[j])) != null) {
		            for(int k = 0; k < h1.get(Integer.parseInt(d2[j])); k++) {
		                a1[index] = Integer.parseInt(d2[j]);
		                index ++;
		            }
		        }
		        h1.remove(Integer.parseInt(d2[j]));
		    }
		    TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer> (h1);
            Iterator itr = tm.keySet().iterator();
            while(itr.hasNext()) {
                int key=(int)itr.next();
                if(h1.get(key) > 1) {
                    for(int k = 0; k < h1.get(key); k++) {
                        a1[index] = key;
		                index ++;
                    }
                } else {
                    a1[index] = key;
		            index ++;
                }
            }
		    for (int p = 0; p < a1.length; p++) {
		        System.out.print(a1[p]+" ");
		    }
		    System.out.println();
		}
	}
}

