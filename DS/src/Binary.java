public class Binary {
	
	static void preorder(bNode root){
		if (root==null) {
			return;
		}
		System.out.print(root.data);
		preorder(root.left);
		preorder(root.right);
		
	}
	
	static void inorder(bNode root){
		if (root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
	
	static void postorder(bNode root){
		if (root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
		
	}
	
	static bNode insert(bNode node, int k) {
		if(node == null) {
			bNode bnode = new bNode(k);
			return bnode;
		}
		
		if(k>node.data){
			node.right = insert(node.right,k);
		}else {
			node.left = insert(node.left,k);
		}
				
		return node;
	}
	
	static boolean isBSTvalid(bNode node) {
		if(node == null) {
			return false;
		}
		
		isBSTvalid(node.left);
			if(prev !=null && node.data <= prev.data) {
				return false;
			}
			
			prev=node;
		isBSTvalid(node.right);
		
		return true;
	}
	
	//depth of tree
	static int maxdepth(bNode node) {
		int dep;
		if(node==null) {
			return 0;
		}
	
		
	int ldep =	maxdepth(node.left);
	int rdep =	maxdepth(node.right);
		if (ldep > rdep) {
			dep = ldep;
		} else {
			dep = rdep;
		}
		return dep + 1;
	}
	
	public static void main(String args[]) {
	//Binary Tree
		bNode root = new bNode(1);
		root.left = new bNode(2);
		root.right = new bNode(3);
		root.left.left = new bNode(4);
		root.left.right = new bNode(5);
    //BST
		bNode bstroot = new bNode(9);
		bstroot.left = new bNode(2);
		bstroot.right = new bNode(5);
		bstroot.left.left = new bNode(1);
		bstroot.left.right = new bNode(3);
		
		
		
		//preorder(root);
		//inorder(root);	
		//postorder(root);
	    //boolean valid = isBSTvalid(bstroot);
	    //System.out.println(valid);
		//System.out.println(maxdepth(root));
		root = insert(root,6);
		int k=0;
			
	}
	static bNode prev;
}

class bNode{
	int data;
	bNode left;
	bNode right;
	bNode (int d){
		data = d;
		left = null;
		right = null;
	}
}