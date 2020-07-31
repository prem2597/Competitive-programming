import java.util.*;

/**
 * @author Prem
 */
class Solution {
    public static void checkLarger(long arr[]) {
        Stack<Long> s = new Stack();
        long arr1[] = new long[arr.length];
        for(int k = arr.length-1; k >= 0; k--) {
            while(!s.isEmpty() && s.peek() <= arr[k]) {
                s.pop();
            }
            if(s.isEmpty()) {
                arr1[k] = -1;
            } else{
                arr1[k] = s.peek();
            }
            s.push(arr[k]);
        }
        for(int z = 0; z < arr.length; z++) {
            System.out.print(arr1[z]+" ");
        }
        System.out.println();
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < x ; i ++) {
		    long[] arr = new long[Integer.parseInt(sc.nextLine())];
		    String[] data = sc.nextLine().split(" ");
		    for (int j = 0; j < arr.length; j++) {
		        arr[j] = Long.parseLong(data[j]);
		    }
		    checkLarger(arr);
		}
	}
}

