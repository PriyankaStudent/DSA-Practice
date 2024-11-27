class Node{
int val;
Node l,r;

Node(int k){
val=k;
l=r=null;
}
}

class ValidateBst{
static Boolean isvalid(Node root, int[] p){
if(root == null) return true;
if(!isvalid(root.l,p)) return false;
if(p[0]>=root.val) return false;
p[0]=root.val;
return isvalid(root.r,p);
}

static boolean isBST(Node root){
int[] p={Integer.MIN_VALUE};
return isvalid(root,p);
}

public static void main(String r[]){
Node root = new Node(4);
root.l = new Node(2);
root.r = new Node(5);
root.l.l = new Node(10);
root.l.r = new Node(3);

if(isBST(root)) System.out.print("Trueeeee....");
else System.out.print("False 🫠");
}
}

