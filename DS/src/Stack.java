//Implement stack using list
public class Stack {
	//push
	void push(int d) {
		if(top == null) {
			top = new Node(d);
		}else {
		Node temp = new Node(d);
		temp.next = top;
		top = temp;
		}
		
	}
	//Pop
	int pop() {
		if (top == null) {
			return 0;
		}
		else {
			int x = top.data;
			top = top.next;
			return x;
		}
	
	} 
	
	//peek
	int peek() {
		if(top == null) {
			return 0;
		} else {
		return top.data; }
	}
	//isEmpty
	boolean isEmpty() {
		if (top == null) {
			return true;
		}
			return false;
	}
	public static void main(String args[]) {
		Stack sl = new Stack();
		sl.push(10); 
        sl.push(20); 
        sl.push(30);
        sl.push(40);
        sl.push(50);
        
		System.out.println(sl.pop());
		System.out.println(sl.peek());
		System.out.println(sl.isEmpty());
		}
	
	Node top ;

}

