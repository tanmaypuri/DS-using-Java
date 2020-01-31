import java.util.Scanner;

public class TreeHeight {
	static Node root;
	static class Node{
		int key;
		Node left,right;
		Node(int temp){
			key=temp;
			left=right=null;
		}
	}
	
	TreeHeight(){
		root=null;
	}
	TreeHeight(int data){
		root=new Node(data);
	}
	
	public static void insert(int key) {
		root = insertItem(root,key);
	}
	
	
	public static Node insertItem(Node root, int key) {   
		if(root == null) {
			root = new Node(key);
			return root;
		}
		else if(root.key>key) {
			root.left = insertItem(root.left,key);
		}
		else {
			root.right = insertItem(root.right,key);
		}
		return root;
	}
	static int heightTree(Node root)  						
    { 
        if (root == null) 
            return 0; 
        else 
        { 
            int l = heightTree(root.left); 
            int r = heightTree(root.right); 
   
            if (l>r) 
                return (l+1); 
             else 
                return (r+1); 
        } 
    } 

	public static void main(String[] args) {
		TreeHeight th = new TreeHeight();
		th.insert(1);
		th.insert(3);
		th.insert(5);
		th.insert(2);
		th.insert(4);
	
		int c = heightTree(root);
		System.out.println("Height of tree is "+c);
	}

}
