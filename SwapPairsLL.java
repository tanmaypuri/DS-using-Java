import java.util.*;

public class SwapPairsLL {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	static Node head;
	static void print()
	{
		Node cur=head;
		while(cur!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	static void insert(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			return ;
		}
		Node cur=head;
		while(cur.next!=null)
		{
			cur=cur.next;
		}
		cur.next=temp;
	}
	static void swap() {
		Node temp=head;
		while(temp!=null && temp.next!=null) {
			int x = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = x; 
            temp = temp.next.next; 
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			insert(sc.nextInt());
		}
		print();
		swap();
		System.out.println();
		print();
	}

}
