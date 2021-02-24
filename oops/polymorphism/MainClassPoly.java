package oops.polymorphism;

public class MainClassPoly {

	public static void main(String[] args) {
		
	  Dog d = new Dog();
	  
	  Pet p = d;
	  
	  Animal a = d;
	  
	  d.walk();           //RUN TIME POLYMORPHISM
	  p.walk();
	  
	  greetings("BK", 3);
	  
	  System.out.println(d.name);           // VARIABLES DONT OVERRIDE
	  
	  System.out.println(p.name);

	}
	

	public static void greetings () {                     //COMPILE TIME POLYMORPHISM
		System.out.println("Hi, there");
	}
	
	public static void greetings ( String s ) {
		System.out.println(s);
	}
	
	public static void greetings( String s, int count) {
		for(int i = 0; i< count; i++) {
			System.out.println(s);
		}
	}
}
