package collectionFrameworks.deque;

public class MyDeque<E> {

	Node<E> head, tail;
	
	public void addToHead(E data) {
		
		Node<E> toAdd = new Node<>(data);
		
		if(head == null) {
			head = tail = toAdd;
			return;}
		
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
		}
	
	
	
	
	
	
	public E removeLast() throws Exception{
		
		if(head == null) {
			return null;}
		
		Node<E> toRemove = tail;
		tail = tail.next;
		
		try{tail.prev = null;}
		catch (NullPointerException e) {
			System.out.println("Last element");}
		
		
		if(tail == null) {
			head = null;}
			
		
		
		return toRemove.data;
	}
	
	
	
	
	
	
	public void addToLast(E data) {
		
		Node<E> toAdd = new Node<>(data);
		
		if (head == null){
			head = tail = toAdd;
			return;}
		
		//Node<E> prev_tail = tail;
		
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
		}
	
	
	
	
	
	
	public E removeFront()throws Exception {
		
		if(head == null) {
			return null;}
		
		Node<E> temp = head;
		head = head.prev;
		
		try {head.next = null;}
		catch (NullPointerException e) {
			System.out.println("This was the last element");}
		
		
		if(head == null) {
			tail = null;}
			
		return temp.data;
	}
	
	
	
	
	
	
	public E peekF() {
		if(head == null) {
			return null;}
		
		return head.data;
	}
	
	
	
	
	
	
	
	public E peekL() {
		if(head == null) {
			return null;}
		
		return tail.data;
	}
	
	
	
	
	
	
	
	
	public static class Node<E>{
		E data;
		Node<E> next, prev;
		
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
		                    }
	                           }
	

}
