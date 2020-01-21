import java.util.*;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int n=s.nextInt();
		System.out.println("enter elements: ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		Arrays.sort(ar);
		int p=0; 
	    for (int i=0;i<n-1;i++){  
	    	if (ar[i] != ar[i+1]){  
	            ar[p++] = ar[i];  
	        }  	
	    }  
	     ar[p++] = ar[n-1]; 
	    System.out.println("Largest: "+ar[p-1]);
	    System.out.println("Second Largest: "+ar[p-2]);
	}
}
