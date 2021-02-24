package oops.inheritance;

public class MainClassInt {

	public static void main(String[] args) {
		
//	    Teacher t = new Teacher();
		
//		Singer s = new Singer();
//		
//		t.name = "Mr.BK";
//		System.out.println(t.name);
//		
//		s.name = "Justin";
//		System.out.println(s.name);
//		
//		t.walk();
//		t.eat();      //THIS WILL OVERRIDE THE EAT OF PERSON CLASS AND WILL ACCESS THE EAT OF TEACHER CLASS
//		t.teach();
//		
//		s.walk();
//		s.eat();
//		s.sing();
		
		// UPCASTING AND DOWNCASTING
		
		Teacher t1 = new Teacher("Mr.BK" /*SUPERKEYWORD EXAMPLE*/ );  
		
		t1.eat();       // SUPERKEYWORD EXAMPLE
		
		Person p =t1;      // UPCASTING
		
	      
		
		Teacher t = (Teacher) p;  //DOWNCASTING
		
		System.out.println(t1 instanceof Teacher);
		System.out.println(t1 instanceof Person);
		System.out.println(t instanceof Person);
		System.out.println(p instanceof Singer);
				
				
		
		

	}

}
