package oops;

class Cat{
	boolean hasfur;
	String color, breed;
	int legs, eyes;
	
	public void fur() {
		System.out.println("My cat has fur: " + hasfur);
	}
	
	public void walk() {
		System.out.println("Cat is Walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("My cat has " + legs + " legs and " + eyes +" eyes");
	}
}

class Dog{
	String breed, name;
	
	public void jump() {
		System.out.println("My dog "+ name +" jumped");
	}
	
	public void desc() {
		System.out.println("My dogs name is " + name +" and its breed is "+ breed);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.walk();
		cat2.eat();
		
		cat1.hasfur = true;
		cat2.hasfur = false;
		
		cat1.fur();
		cat2.fur();
		
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 1;
		
        cat1.description();
		cat2.description();
		
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Poodle";
		poodle.name = "Mr Moolchand Ji";
		
		
		husky.jump();
		husky.desc();
		
		poodle.jump();
		poodle.desc();
	}

}
