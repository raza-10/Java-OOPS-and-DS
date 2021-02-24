package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNo = 100;
		int secondNo = 200;
		 int result = maxOf(firstNo, secondNo);
		 
		 System.out.println(result);
		 
		sayHi();
		
		maxOf(100);
}
	static void maxOf(float d) {
		
	}
	
	static int maxOf(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
		
	}   static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}
}
    
