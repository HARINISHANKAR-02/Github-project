package Inheritance;

public class Vehicle {
	public void move() {
		System.out.println("Vehicle is moving");
		}
}
class Car extends Vehicle{
	public void move(){
		System.out.println("Car is Running");
		}
}
public class Runtimepolymorphism{
	public static void main (String[] args) {
		Car c=new Car();
		c.move();
		c.move();
		}
	}




