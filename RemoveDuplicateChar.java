import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++)
		{
		String str=s.next();
		char ch[]=str.toCharArray();
		int n=ch.length;
		if(ch[0]!=ch[1])
		System.out.print(ch[0]);
		for(int i=1;i<n-1;i++)
		{
		if(ch[i]!=ch[i+1] && ch[i]!=ch[i-1])
		{
		System.out.print(ch[i]);
		}
		}
		if(ch[n-1]!=ch[n-2])
		System.out.print(ch[n-1]);
		}
	}

}