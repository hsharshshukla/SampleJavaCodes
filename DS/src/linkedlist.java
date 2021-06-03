
public class linkedlist {

	 static boolean checksort(Node head) {
	   if (head == null || head.next == null) {
		   return true;
	   } 
		if(head.data >= head.next.data)
		{
			return false;
		}
		return checksort(head.next);
	 }
	 
	 static boolean searchelement(Node head,int n) {
		 if (head== null) 
		 {
			 return false;
		 }
		 
		 if(head.data == n ) {
			 return true;
		 }
		 return searchelement(head.next, n);
	 }
	 
	 static int findlength(Node head) {
		 if(head==null) {
			 return 0;
		 }
		 return (1+findlength(head.next));
	 }
	 
	static void printlist(Node head)
	{
		if(head==null) {
			return;
		}
		System.out.print(head.data + " ");
		printlist(head.next);
	}
	static void inserttail(Node head,int n) {
		if(head.next==null) {
			head.next = new Node(n);
			return;
		}
		inserttail(head.next,n);
	}
	 
	static Node push(Node head,int n) {
		Node newnode = new Node(n);
		newnode.next = head;
		return (head  = newnode);
		
	}
	
	static Node insertatk(Node head,int n,int k)  {
		Node tracehead=head;
		if (head == null) {
			return head;
		}
		
		
		while(k-- >0) {
		 head = head.next;
			if(k==2) {
			 Node node = new Node(n);
			 node.next = head.next;
			 head.next = node;
			 break;
			
			}
			
		}
		return tracehead;
	}
	static Node remove(Node head, int k) {
		Node tracehead  = head;
		
		while(k-- >0) {
			head = head.next;
			if(k==2) {
				head.next = head.next.next;
				break;
			}
		}
		
		return tracehead;
	}
	
	static Node removefirstnode(Node head) {
		
		if(head==null) {
			return head;
		}
		head = head.next;
		return head;
	}
	
	static Node removekthfromend(Node head, int k) {
		
		if (head == null || head.next==null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (k-- >0) {
			fast  = fast.next;
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
			
			if(fast.next==null) {
				slow.next = slow.next.next;
				break;
			}
		}
		return head;
	}
	
	static Node reverse(Node node) {
		    Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        
	        return prev; 
	}
	
	static Node add2number(Node head, Node node) {
		Node res= null;	
		Node temp =null;
		Node prev =null;
		int sum=0;
		int carry=0;
		if(head==null || node == null) {
			return head;
		}
		
		if(head != null && node ==null) {
			return head;
		}
		
		if(head == null && node != null) {
			return node;
		}
		
		//iterate to get all values 567 + 867
		while(head !=null || node != null) {
			
			if(head!=null) {
				sum += head.data;		//5	   6 	7
				head = head.next;
			}
			if(node!=null) {
				sum += node.data;		//8	   6	7
				node = node.next;
			}
			sum +=carry;				//
			carry=0;
			if(sum >= 10) {
				carry = sum/10;
				sum = sum%10;
			}
			temp = new Node(sum);
			
			if(res==null) {
				res=temp;				
			} 
			else {
				prev.next=temp;
				
				}
		sum =0;
		prev = temp;
		}
		if (carry>0) {
			temp = new Node (carry); 
			prev.next=temp;
		}
		res =reverse(res);
		return res;
	}
	
	public static void main(String args[]) {
	//Create  
		Node head = new Node(7);
		head.next = new Node(5);
		head.next.next = new Node(9);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(6);	
		
		Node node = new Node(8);
		node.next = new Node(4);
		//node.next.next = new Node(2);
		
		///boolean jack = checksort(head);
		//System.out.print(jack);
		//boolean jack1=searchelement(head,2);
		//System.out.print(jack1);
		//int jacklen = findlength(head);
		//System.out.print(jacklen);
		//inserttail(head,10);
		//head = push(head,10);
		// head = insertatk(head,10,3);
		// head = removefirstnode(head);
		// head = remove(head,3);
		//head = removekthfromend(head,3);
		head = add2number(head,node);
		//head  = reverse(head);
		printlist(head);
		
		
 }
	
}

class Node {
	Node next;
	int data;
	Node(int d){
		next = null;
		data =d;
	}
	
}