package oops.interfaces;

public interface StudentInter {

	  abstract void study();
	  
	 default void changesAfterJava8() {
		 
		 System.out.println("Changed");
	  }
	  
}
