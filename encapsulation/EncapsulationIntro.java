package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		obj.setAge(12);
		
		System.out.println(obj.getAge());
		
		obj.setName("Tommy");
		
		System.out.println(obj.getName());

	}

}
