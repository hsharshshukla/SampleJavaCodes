import java.util.*;
class MComp implements Comparator<String>{
	public int compare(String a, String b){
		
		return b.compareTo(a);
			
	}
}		
			
class Basic{
	public static void main(String args[]){
			TreeSet<String> ts = new TreeSet<>(new MComp());
			ts.add("C");	
			ts.add("F");
			ts.add("E");
			ts.add("A");
			
			for(String element:ts) {
				System.out.println(element+"   ");
					
			}
		
		}
		}	