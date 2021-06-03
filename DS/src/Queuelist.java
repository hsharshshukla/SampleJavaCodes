
public class Queuelist {
	//Enqueue
	void enqueue(int d) {
		if(rear == null) {
			front = rear = new Node(d);
		} else {
		Node temp = new Node(d);
		rear.next = temp;
		rear = temp;}
	}
	
	//Dequeue
	void dequeue() {
		if (front==null) {
			return;
		}
		front = front.next;
		
		if (front == null) {
			rear = null;
		}
	}
	
	
	//Front 
	
	//Rear
	
	
	//isEmpty
	boolean isEmpty() {
		return(rear==null);
	}
	
	public static void main(String args[]) {
		Queuelist qa = new Queuelist();

        System.out.println(qa.isEmpty());
        
		qa.enqueue(10); 
        qa.enqueue(20); 
        qa.dequeue(); 
        qa.dequeue(); 
        System.out.println(qa.front.data);
        System.out.println(qa.rear.data);
        qa.enqueue(30); 
        qa.enqueue(40); 
        qa.enqueue(50); 
        qa.dequeue(); 
        
        
        System.out.println(qa.isEmpty());
        
        System.out.println(qa.front.data);
        System.out.println(qa.rear.data);
	}
Node queue,front,rear;
}

