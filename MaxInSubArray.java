import java.util.Scanner;

public class MaxInSubArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int n=s.nextInt();
		System.out.println("enter the elements: ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		System.out.println("enter value of k: ");
		int k=s.nextInt();
		
		for(int i=0;i<=n-k;i++) {
			int max=ar[i];
			for(int j=0;j<k;j++) {
				if(ar[i+j]>max)
					max=ar[i+j];
			}
			System.out.print(max+" ");
		}
		
	}

}
