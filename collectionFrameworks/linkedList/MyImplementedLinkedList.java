package collectionFrameworks.linkedList;

public class MyImplementedLinkedList {

	public static void main(String[] args) {
		 
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		
		for (int i =0; i<10; i++) {
			ll.add(i);
		}
		 
		 ll.print();

	}

}
