import java.util.Scanner;
public class RemoveDuplicateLL 
{
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	static Node head;
	public static RemoveDuplicateLL insert(RemoveDuplicateLL li, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(li.head==null)
			li.head = newNode;
		else {
			Node last = li.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
		}
		return li;
	}
	public static void display(RemoveDuplicateLL li) {
		Node temp = li.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static RemoveDuplicateLL remove(RemoveDuplicateLL li) {
		Node curr = li.head;
		while(curr!=null) {
			Node temp = curr;
			while(temp!=null && temp.data==curr.data) {
				temp=temp.next;
			}
			
			curr.next = temp;
			curr = curr.next;
		}
		return li;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		RemoveDuplicateLL li = new RemoveDuplicateLL();
		System.out.println("Enter size of the LinkedList");
		int n=s.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			li.insert(li, s.nextInt());
		}
		System.out.println("Before deletion");
		li.display(li);
		System.out.println("After deletion");
		li.remove(li);
		li.display(li);

	}

}
