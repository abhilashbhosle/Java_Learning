// Interfaces are the types used to create variables and methods.
// We cannot create objects directly using interfaces.
// There should be the class which implements the interface type and we can define methods there.
// All the variables inside the interface are final and static.
// Static means we can call those variables directly with their class names.
// ** The methods inside the interfaces are by default abstract.

interface A{
	String name="abhi"; // static and fina;
	void age();
	void num();
}

class B implements A{
	public void age(){
		System.out.println("Inside age show");
	}
	public void num(){
		System.out.println("Inside num show");
	}
}

public class Main{
	public static void main(String[] args) {
		A obj;
		obj=new B();
		obj.age();
		obj.num();
		// A.name="Hello";
		System.out.println(A.name);
	}
}
