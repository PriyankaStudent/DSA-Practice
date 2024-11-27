class Node{
	int val;
	Node l,r;
	public Node(int k){
		val=k;
		l=r=null;	
	}
}

public class Bstree{
	Node root;
	void insert(int d){
		root=insertrec(root,d);
	}
	
	Node insertrec(Node root, int k){
		if(root==null){	
			root=new Node(k);
			return root;
		}
		else if(root.val<k){
			root.r=insertrec(root.r,k);
		}	
		else{
			root.l=insertrec(root.l,k);
		}
		return root;
	}
	
	void inorder(){
		inorderrec(root);
	}

	void inorderrec(Node root){
		if(root!=null){
			inorderrec(root.l);
			System.out.print(root.val+" -> ");
			inorderrec(root.r);
		}
	}

	public static void main(String ar[]){
		Bstree bst=new Bstree();
		bst.insert(60);
		bst.insert(40);
		bst.insert(70);
		bst.insert(30);
		bst.insert(20);
		bst.insert(50);
		bst.insert(90);
		bst.insert(65);
		bst.insert(80);
		bst.insert(75);
		
		bst.inorder();
		
	}
}