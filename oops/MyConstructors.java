package oops;

class Vehicles {
	int wheels;
	int headLights;
	String color;


//  Vehicles (){       // NO ARG CONSTRUCTORS
//  
//	  wheels = 4;
// }
  
	
	Vehicles(int wheels){     //PARAMETRIZED CONSTRUCTORS
		this.wheels = wheels;
		headLights = 2;
	}
	
	Vehicles(int wheels, String color){      //CONSTRUCTOR OVERLOADING
		this.wheels = wheels;
		this.color = color; 
		headLights = 2;
	}
}

public class MyConstructors {
	
	MyConstructors(){
		
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		//MyConstructors obj = new MyConstructors();
		
		Vehicles car = new Vehicles(4, "blue");
		Vehicles scooty = new Vehicles(2, "Black");
		
		
		System.out.println(car.wheels+ " wheels, " + scooty.headLights + " healights and the color is " + scooty.color);

	}

}
