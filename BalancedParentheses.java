import java.util.*;
public class BalancedParentheses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str = sc.next();

		int n = str.length();
		Stack<Integer> s = new Stack<>();
		s.push(-1);
		int count=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='(')
				s.push(i);
			else {
				s.pop();
					if(!s.empty())
						count = Math.max(count, i-s.peek());
					else
						s.push(i);
			}
		}
		System.out.println(count);
	}

}