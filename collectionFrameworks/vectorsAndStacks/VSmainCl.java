package collectionFrameworks.vectorsAndStacks;

import java.util.*;

public class VSmainCl {

	public static void main(String[] args) throws Exception {
		
		List<Integer> v = new Vector<>();
		
		v.add(12);
		v.add(20);
		
		MyStack <Integer> stack = new MyStack<>();
		
		stack.push(12);
		stack.push(33);
		stack.push(45);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		stack.Print();
		
		

	}

}
