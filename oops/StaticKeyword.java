package oops;

import oops.A.C;


public class StaticKeyword {
	
	
	
	static {
		System.out.println("in block 1");
	}
	
	
	

	public static void main(String[] args) {
		
	A obj = new A();
	
	A.B objb = obj.new B();  // BECAUSE B IS NON STATIC, WE CANNOT USE IT WITHOUT GIVING THE REFERENCE OF A
	
	C objc = new A.C();   // SINCE C IS STATIC, WE DO NOT NEED TO CREATE AN OBJECT OF A FOR CREATING AN OBJECT OF C
	
	

	System.out.println(objc.name);
	
	}
        
	
	
	
       static {
		System.out.println("in block 2");
	}


}

	