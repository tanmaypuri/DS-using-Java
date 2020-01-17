import java.util.*;
public class CheckAnagrams {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first string :");
		String a = s.next();
		System.out.println("Enter second string :");
		String b = s.next();
		char ch[] = a.toCharArray();
		char ch1[] = b.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		int flag=0;
		if(ch.length == ch1.length) {
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=ch1[i]) {
					flag++;
				}
			}
			if(flag==0)
				System.out.println("Anagrams");
			else
				System.out.println("Not Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}
