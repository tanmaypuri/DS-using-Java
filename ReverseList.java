import java.util.*;

public class ReverseList {

	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}

	static Node head;
	
	public static ReverseList insert(ReverseList li, int data) {
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
	
	public static void reverseList() {
		Node current, prev, next;
		current=head;
		prev=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public static void display(ReverseList li) {
		com.in.ReverseList.Node temp = li.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseList li = new ReverseList();
		li.insert(li, 10);
		li.insert(li, 20);
		li.insert(li,30);
		li.reverseList();
		li.display(li);

	}

}