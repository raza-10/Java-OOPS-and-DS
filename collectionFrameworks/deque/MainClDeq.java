package collectionFrameworks.deque;

import java.util.ArrayDeque;

public class MainClDeq {

	public static void main(String[] args) throws Exception {
		
//		ArrayDeque<Integer> ad = new ArrayDeque<>();
//		
//		ad.addFirst(12);
//		ad.addFirst(34);
//		
//		
//		
//		ad.pop();
//		System.out.println(ad.peek());
//		
//		
//		//we can also use it as a stack
//		
//		ad.push(88);
//		ad.push(233);
//		
//        System.out.println(ad);
		
		MyDeque<Integer> md = new MyDeque<>();
		
	    md.addToHead(2);
		
	    md.addToHead(44);
		
		md.addToHead(4);
		
		md.addToLast(434);
		
		md.addToHead(67);
//		
//		
//		
		System.out.println(md.peekF());
		
		md.addToLast(33);
//		
//		System.out.println(md.removeLast());
//		System.out.println(md.removeFront());
		System.out.println(md.removeFront());
		
		System.out.println(md.peekL());
		System.out.println(md.removeLast());
	}

}
