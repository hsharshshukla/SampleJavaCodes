
public class MinHeap {
	
		int size;
		int hcap;
		int[] array ;
		
		MinHeap(int d){
			size=0;
			hcap=d;
			array = new int[d];
		}
		//insert
		void insert(int d) {
			if(size==hcap) {
				System.out.println("Heap Full");
				return;
			}
			
			array[size] =	d;
			size++;
			
			//Check min heap property
			//while(i !=0 && array) {}
		}
		//extract
		
		//get minimum
		
		public static  void main(String args[]) {
			MinHeap heap = new MinHeap(10);
		}
		
}
