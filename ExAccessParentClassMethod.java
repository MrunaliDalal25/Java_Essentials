package Inheritance;

public class ExAccessParentClassMethod {
	String color;
	 public void animalSound() {
		 System.out.println("Animal makes Sounds");
	 }
}

class Cat extends ExAccessParentClassMethod {
	String type;
	public void animalSound() {
		super.animalSound();
		System.out.println("Dog says bow bow");
	}
	
	
public class SuperMain {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.animalSound();
		System.out.println("in main method");
	}
		
		

	}

}
