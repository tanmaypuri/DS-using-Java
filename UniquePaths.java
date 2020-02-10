import java.util.Scanner;
public class UniquePathDP {

	static int uniquePaths(int m,int n) {
		if(m==0 || n==0)
			return 0;
		int ar[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			ar[i][0]=1;
		}
		for(int j=0;j<n;j++) {
			ar[0][j]=1;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				ar[i][j]=ar[i][j-1] + ar[i-1][j];
			}
		}
		return ar[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int res=uniquePaths(m,n);
		System.out.println(res);
	}

}
