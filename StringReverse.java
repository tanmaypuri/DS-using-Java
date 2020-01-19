import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of test cases: ");
		int t=s.nextInt();
		for(int j=0;j<t;j++) {
			System.out.println("Enter the string: ");
			String str = s.next();
			String str1 [] = str.split("\\.");
			for(int i=str1.length-1;i>0;i--) {
				System.out.print(str1[i]+".");
			}
			System.out.println(str1[0]);
		}
		 
	}
}