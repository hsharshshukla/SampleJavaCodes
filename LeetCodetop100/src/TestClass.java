import java.util.*;

public class TestClass {
	public static void main(String args[] ) {
		Scanner s = new Scanner(System.in);
        //String name = s.nextLine();                 // Reading input from STDIN
		int qsize = s.nextInt(); 
		
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i=0; i<qsize;i++) {
			q.add(s.nextInt());
		}
		
		Queue<Integer> ideal = new LinkedList<Integer>();
		for (int i=0; i<qsize;i++) {
			ideal.add(s.nextInt());
		}
		//use binary search for task location
		
		int time =0;
		//iterate to count time and  move elements 
		while (!q.isEmpty()) {
			if(ideal.peek() == q.peek()) {
				q.remove();
				ideal.remove();
				time++;
			}else {
				while(q.peek() != ideal.peek()) {
					int temp = q.remove();
					q.add(temp);
					time++;
				}
			}
		}
		System.out.println(time);
		
	}
	
}
