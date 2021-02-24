package collectionFrameworks.linkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		
		List<Integer> al = new ArrayList<>();
		
		
		
		
		getTimediff(al);
		getTimediff(ll);
 		
		
	}
        static void getTimediff(List<Integer> list) {
	
        	long start = System.currentTimeMillis();
        	
        	for(int i =0; i<100000; i++) {
        		list.add(0, i);
        	}
        	long end = System.currentTimeMillis();
        			System.out.println(list.getClass().getName() + " --> " + (end - start));
       }
}
