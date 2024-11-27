class Node{
	int val;
	Node left,right;
	public Node(int k){
		val=k;
		left=right=null;
	}
}


class BST{
	static Node search(Node root, int key){
		if(root==null||root.val==key){
			return root;
		}
		else if(root.val<key){
			return search(root.right, key);
		}
		else{
			return search(root.left,key);
		}
	}
	public static void main(String ar[]){
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(70);
		root.left.left=new Node(10);
		root.right.right=new Node(80);
		Node res=search(root,10);
		if(res!=null)System.out.print("Found");
		else System.out.print("Not Found");
	}

}