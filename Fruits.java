package Inheritance;

public class Fruits {
 String color="red";
 String shape="oval";
 int price=50;
 
 void eat(){
	 System.out.println("Fruits are Yummy");
 }
}
class Apple extends Fruits{
	double weight;
	void pill() {
		System.out.println("Apple need to pill first");
	}
	
}
class Main{
	public static void main(String[] args) {
		Apple a=new Apple();
		System.out.println("the Color of Apple is:" + a.color);
		System.out.println("The Shape of Apple is:" +a.shape);
		System.out.println("The price of an apple is:" +a.price);
		a.eat();
		a.pill();
	
	}
}

