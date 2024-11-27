class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTRaw {
    Node root;

    // Insert a new node
    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // In-order traversal
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BSTRaw bst=new BSTRaw();
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


        System.out.println("In-order traversal of BST:");
        bst.inorder();
    }
}