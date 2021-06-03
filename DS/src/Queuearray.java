
public class Queuearray {
	//Enqueue
	void enqueue(int d) {
		if(size >= qcap) {
			System.out.println("Queue is Full");
			return;
		}
		if(size==0) {
			array[0]=d;
			front=rear;
			size++;
		}else {
		rear = (rear+1) % qcap;
		array[rear]=d;
		size++;}
		
	}
	//Dequeue
	int dequeue() {
		if (size==0) {
			return 0;
		}
		int x= array[front];
		front = (front+1) % qcap;
		size--;
		return (x);
	}
	
	
	//Front element
		int front() {
			if(size==0) {
				return 0;
			}else {
				return (array[front]);
			}
			
		}
	//Rear element
	 int rear() {
		 if(size==0) {
			 return 0;
		 } else {
			 
			 return(array[rear] );
		 }
	 }
	 
	 //isFull
	 boolean isFull() {
		 return (size==qcap);
	 }
	 
	public static void main(String args[]) {
		Queuearray qa = new Queuearray(6);
		qa.enqueue(10); 
        qa.enqueue(20); 
        qa.enqueue(30); 
        qa.enqueue(40); 
        qa.enqueue(50); 
        qa.enqueue(60);
        qa.dequeue();
        qa.enqueue(70); 
        qa.enqueue(80);
        
        System.out.println(qa.dequeue() +  
                " dequeued from queue\n"); 
   
   System.out.println("Front item is " +  
                          qa.front()); 
      
   System.out.println("Rear item is " +  
                           qa.rear()); 
	}

int[] array ;
int size=0;
int rear,front,qcap;
Queuearray(int d){
	qcap =d;
	rear=front=size=0;
	array = new int[d];
}

}
