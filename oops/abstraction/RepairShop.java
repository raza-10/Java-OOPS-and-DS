package oops.abstraction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("Car is repaired");
	}

	public static void main(String[] args) {
		
		WagonR wagonr = new WagonR();
		
		Audi audi = new Audi();
		
		repairCar(audi);
		
		audi.accelerate();
		
		wagonr.brake();
		
		audi.honk();
		
		

	}

}
