package oops.finalKeyword;

final public class StudentFinal {       //THIS CLASS CANNOT HAVE CHILDREN

	final int rollNo;       //BLANK FINAL VARIABLE
	final String name;
	
	String Name;
	int age;
	
	{ rollNo = 4; }               //INITIALISER BLOCK
      
	
	
	
	public StudentFinal() {      //CONSTRUCTOR BLOCK
		
		name = "BK"; }                     
	
	final public void getDesc() {
		System.out.println("The student name is null");    //THIS METHOD CANNOT BE OVERRIDEN
	}
	
	
}
