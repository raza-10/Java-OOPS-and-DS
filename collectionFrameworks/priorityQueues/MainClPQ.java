package collectionFrameworks.priorityQueues;

import java.util.PriorityQueue;

public class MainClPQ {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		
		pq.add(12);
		pq.add(34);
		pq.add(1);
		pq.add(100);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		

	}

}
