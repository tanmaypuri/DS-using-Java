import java.util.*;
public class StringPermutation {
	
	static String swap(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  

	static void permutation(String str,int start,int end) {
		int i;
		if(start==end)
			System.out.print(str+" ");
		else {
			 for (i=start;i<=end;i++)  
	            {    
	                str = swap(str,start,i);     
	                permutation(str,start+1,end);   
	                str = swap(str,start,i);  
	            }  
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str=s.next();
		int n=str.length();
		permutation(str,0,n-1);
	}

}
