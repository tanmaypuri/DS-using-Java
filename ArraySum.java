import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of 1st Array: ");
		int p = s.nextInt();
		System.out.println("Enter size of 2nd Array: ");
		int q = s.nextInt();
		int ar1[] =new int[p];
		int ar2[] = new int[q];
		System.out.println("Enter elements in 1st Array: ");
		for(int i=0;i<p;i++) {
			ar1[i]=s.nextInt();
		}
		System.out.println("Enter elements in 2nd Array: ");
		for(int i=0;i<q;i++) {
			ar2[i]=s.nextInt();
		}
		
		System.out.println("Enter value of sum: ");
		int k = s.nextInt();
		
		System.out.println("Pairs are -:");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				if(ar1[i]+ar2[j]==k) {
					System.out.print(ar1[i]+",");
					System.out.println(ar2[j]);
				}
			}
		}
	}
}
