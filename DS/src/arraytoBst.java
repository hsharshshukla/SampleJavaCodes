
public class arraytoBst {
	static bNode root;
	bNode arraytobst(int[] array,int start, int end) {
		bNode node;
		if ( start>end) {
			return null;
		}
		int mid = (start+end)/2;
		node  = new bNode(array[mid]);
		
		node.left = arraytobst(array, start, mid-1);
		node.right = arraytobst(array,mid+1,end);
		return node;
	}
	
	void inorder(bNode node) {
		if(node == null) {
			return;
		}
		
		
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
		
	}
	
	public static void main(String args[]) {
	    arraytoBst tree = new arraytoBst();
		
		int arr[] = new int[] {1,2,3,4,5,6,7};
		int size = arr.length;
		
		 root = tree.arraytobst(arr,0,size-1);
		 bNode nodek = root;
		 tree.inorder(root);
		 
		 int k=0;
		
	}

}
