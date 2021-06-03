
public class Stackarray {
	static final int size = 1000;
	int[] array = new int[size];
	int top =-1;

	//push 
	void push(int d) {
		if(top >= size) {
			System.out.println("Stack OverFlow");
		} else {
		array[++top] = d;
		}
	}
	//pop
	int pop() {
		if(top < 0) {
			System.out.println("Stack UnderFlow");
			return 0;
		}else {
		int x = array[top];
		array[top--]=0;
		return x;
		}
	}
	//peek
	int peek() {
		if (top < 0) {
			System.out.println("Stack UnderFlow");
			return 0;
		}else {
		int x = array[top];
		return x;
		}
	}
	//isEmpty
	boolean isEmpty() {
		if (top <0) {
			return true;	
		}
		
		return false;
	}
	public static void main(String args[]) {
		Stackarray sl = new Stackarray();
		
        sl.peek();
        sl.push(10); 
        sl.push(20); 
        sl.push(30); 
       System.out.println(sl.pop());
       System.out.println(sl.peek());
		
	}
}
