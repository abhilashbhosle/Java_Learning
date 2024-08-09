// Abstract : When we just declare a method inside the class without defining it,
// expecting that method would get the declaration in it's inherited class we use abstract keyword
// while defining that method.
// If there is a abstract method inside the class, the class should be predefined with abstract class.
// Note ** - We can't create the object of abstract class.

abstract class Car{
	public abstract void drive();

	public void playMusic(){
		System.out.println("Music started...");
	}
}

class Innova extends Car{
	public void drive(){
		System.out.println("Car Started...");
	}
}

public class Main{
	public static void main(String[] args) {
		Innova obj=new Innova();
		obj.drive();
	}
}