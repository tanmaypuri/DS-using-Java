import java.util.Stack;
import java.util.Scanner;
public class StackMinElement {
	
	static Stack<Integer> s = new Stack<Integer>();
	static Stack<Integer> s1 = new Stack<Integer>();
	
	static void push(int x) {
		s.push(x);
		if(s1.empty())
			s1.push(x);
		else {
			if(s1.peek()>=x)
				s1.push(x);
		}
	}
	static int min() {
		if(s1.empty()) {
			System.out.println("stack underflow");
			return -1;
		}
		else {
			return s1.peek();
		}
	}

	public static void main(String[] args) {
		StackMinElement st = new StackMinElement();
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of the stack");
		int n=s.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			st.push(s.nextInt());
		}
		System.out.println("Minimum element is "+st.min());
	}

}
