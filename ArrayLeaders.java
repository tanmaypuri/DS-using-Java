import java.util.*;
public class ArrayLeaders {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int n=s.nextInt();
		System.out.println("Enter the elements: ");
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
        int c;
		for(int i=0;i<n-1;i++) {
			 c=0;
			for(int j=i+1;j<n-1;j++) {
				if(!(ar[i]>=ar[j]))
					c++;
			}
			if(c==0)
				System.out.print(ar[i]+" ");
		}
		System.out.print(ar[n-1]);
	}
}