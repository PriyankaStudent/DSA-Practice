class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeHeight {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(8);
        root.right = new TreeNode(18);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(11);

        System.out.println("Height of the binary tree: " + maxDepth(root));  // Expected Output: 3
    }
}


