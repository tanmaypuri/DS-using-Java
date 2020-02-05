import java.util.*;
public class PhoneBook {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of enteries: ");
		int n=s.nextInt();
		String []name=new String[n];
		int phone[] = new int[n];
		for(int i=0;i<n;i++) {
			 name[i] = s.next();
			phone[i] = s.nextInt();
		}
		String str[] = new String[n];
		for(int j=0;j<n;j++) 
			str[j] = s.next();
		
		for(int i=0;i<n;i++) {
			if(str[i].equals(name[i])) {
				System.out.println(name[i]+" = "+phone[i]);
			}
			else
				System.out.println("not found");
		}
	}

}