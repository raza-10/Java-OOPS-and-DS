package methods;

public class PassByValue {

	public static void main(String[] args) {
		
//		int c = 32; 
//		int d = 21;
//		swap (c, d);
//		System.out.println(c+ " " + d);
		
		
//		Dog c = new Dog();
//		Dog d = new Dog();
//		
//		c.legs = 4;
//	    d.legs = 3;
//		
//		swap(c, d);
		
		Dog a = new Dog();
		a.legs = 4;
		
		changeDog(a);
		
		System.out.println(a.legs);
		
//		System.out.println(c.legs + " "+ d.legs);
	}
     
	static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap(Dog a, Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
	}
	
	static void changeDog(Dog c) {
		c.legs = 6;
	}
}
   
 class Dog{
int legs;
  }