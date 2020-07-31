import java.util.*;

class Solution {
    public static boolean isbalancedpara(String s) {
        Stack<Character> left = new Stack();
        for(int j = 0; j < s.length(); j ++) {
            if(s.charAt(j) == '(' || s.charAt(j) == '[' || s.charAt(j) == '{') {
                left.push(s.charAt(j));
            } else {
                if(left.isEmpty()) {
                    return false;
                }
                if(s.charAt(j) == ')' && left.peek() !='(' || s.charAt(j) == ']' && left.peek() != '[' || s.charAt(j) == '}' &&  left.peek() != '{') {
                    return false;
                }
                left.pop();
            }
        }
        return left.isEmpty();
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < x ; i ++) {
		    String data = sc.nextLine();
		    boolean y = isbalancedpara(data);
		    if(!y) {
		        System.out.println("not balanced");
		    } else {
		        System.out.println("balanced");
		    }
		}
	}
}

