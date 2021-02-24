package oops.finalKeyword;

public class MainClassFinal  {

	
	
	
	final int ROLL_NO = 4;
	 
	
	
	public static void main(String[] args) {
		
		final String name;
		
		
		final StudentFinal obj = new StudentFinal();      //NOW WE CANNOT GIVE THE REFERENCE OF THIS OBJECT TO ANY OTHER OBJECT
		
	  	StudentFinal obj2 = new StudentFinal();	 
	   
	  	obj.age = 12;
	  	
	  	MainClassFinal obj3 = new MainClassFinal();
	  	
	  	//obj3.getDesc();
	  	
	  	
	
	}

}
