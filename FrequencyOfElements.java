import java.util.Scanner;
public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		System.out.println("Enter the elements: ");
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		int count;
		for(int i=0;i<n;i++)
		{
			 count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j] && arr[j]!=0)
				{
					count++;
					arr[j]=0;
				}
			}
			if(arr[i] != 0)
				System.out.println(arr[i]+" -> "+count);

		}
		
	}

}