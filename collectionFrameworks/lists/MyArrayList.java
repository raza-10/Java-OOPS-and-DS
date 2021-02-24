package collectionFrameworks.lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
        List<String> fruits = new ArrayList<>(); // we can also write list instead of arraylist because it extends list interface
		
        List <String> vegetables = new ArrayList<>();
        
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Watermelon");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		fruits.addAll(vegetables);
		
		fruits.set(1, "Banana");
		
		fruits.remove(2);
		
		//fruits.clear();
		
		fruits.removeAll(vegetables);
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.get(1));
		
		System.out.println(fruits);
		
		System.out.println(fruits.contains("Guava"));
		
		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e : temp) {
			System.out.println(e);
		}
		
		
		
		// GENERICS
		
		
		
		Pair <String, Integer> p1 = new Pair("Anuj", 23);
		
		Pair <Boolean, String> p2 = new Pair (true, "BK");
		
		p1.getDescription();
		p2.getDescription();
		
		

	}

}