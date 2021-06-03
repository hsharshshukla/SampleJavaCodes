
public class Sort {
		
	static int[] quicksort(int[] array) {
		
		return array;
	} 
	
	static int[] mergesort(int[] array, int l, int h) {
		if (array.length <= 0) {
			return array;
		}
		
		if(l>=h) {
			if(array[l]>array[h]) {
				int temp = array[h];
				array[h] = array[l];
				array[l] = temp;
			}
		}
		else {
		
		int k = (l+h)/2;
		//left side traversal
			mergesort(array,l,k);	
				
		//right side traversal
			mergesort(array,k,h);
		}
		return array;
	}
	
	static void printarray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		
		int[] array = new int[] {2,12,11,13,5,6,7};
		//array = quicksort(array);
		int l =0;
		int h=array.length;
		mergesort(array,l,h-1);
		 printarray(array);
	}
}