package collectionFrameworks.vectorsAndStacks;

import collectionFrameworks.linkedList.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();

	  
	
	
	
	void push(E e) {
		
		ll.add(e);}
	
	
     
	
	
	E pop() throws Exception {
    	  if(ll.isEmpty()) {
    		  throw new Exception("Popping is not allowed from a empty linked list");}
    	
    	        return ll.removeLast();}
	
    	  
       
      
      
      E peek() throws Exception{
    	   if(ll.isEmpty()) {
     		  throw new Exception("Peeking is not allowed from a empty linked list");}
    	 
    	   return ll.getLast();}
                                
      
                  
      
                       void Print() {
	                  
                    	   ll.print();
                                    }

}
