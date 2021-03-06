
 //Definition for singly-linked list.
import java.util.*;
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
 class Solution {
	 public static void main(String args[]) {
		 Solution sl  = new Solution();
		 ListNode[] lists = new ListNode[3];
		
		 ListNode tlist = new ListNode(1);
		 ListNode templ = tlist;
		 		  templ.next = new ListNode(4);
		 		  templ = templ.next;
		 		  templ.next = new ListNode(5);
		 		  lists[0] = tlist;
		 		  tlist = null;
		 		  
		 		  
		  tlist = new ListNode(1);
		  templ = tlist;
		  
		  templ.next = new ListNode(3);
		  templ = templ.next;
		  templ.next = new ListNode(4);
		  lists[1] = tlist;
		  tlist = null;
 		  
 		  
		  tlist = new ListNode(1);
		  templ = tlist;
 		  templ.next = new ListNode(6);
 		  lists[2] = tlist;
		 
		 
		sl.mergeKLists(lists);
	 }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i=0;i<lists.length;i++){
            while(lists[i] != null){
                q.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode result = null;
        ListNode temp = result;
        
        if(!q.isEmpty()) {
        	result = new ListNode(q.poll());
            temp = result;
        }
        
        while(!q.isEmpty()){
            temp.next = new ListNode(q.poll());
            temp = temp.next;
        }
        
        return result;
        
    }
}