import java.util.*;
public class StringPermutation {
	
	static String swap(String str1, int i, int j) {  
        char[] ch =str1.toCharArray();    
        char temp = ch[i];  
        ch[i] = ch[j];  
        ch[j] = temp;  
        return String.valueOf(ch);  
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
