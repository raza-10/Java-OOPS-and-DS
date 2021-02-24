package collectionFrameworks.queue;

//import java.util.*;

public class MainClQueue {

	public static void main(String[] args) {
		
		//Queue<Integer> q = new LinkedList<>();
		
//		q.add(23);
//		q.add(43);
//		q.add(56);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		
//		System.out.println(q.remove());
//		
//        System.out.println(q.element());
//        
//        System.out.println(q.remove());
//        
//        System.out.println(q.poll());
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(23);
		
		mq.enqueue(232);
		
		mq.enqueue(238);
		
		mq.enqueue(243);
		
		mq.print();
		
		System.out.println(mq.peek());
		
		System.out.println(mq.dequeue());
		
		System.out.println(mq.dequeue());
		
		System.out.println(mq.dequeue());
		
		System.out.println(mq.dequeue());
		
		System.out.println(mq.dequeue());
		
		mq.enqueue(200);
		
		System.out.println(mq.dequeue());
		
		
	}

}
