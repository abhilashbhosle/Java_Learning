// Upcasting: Refering to the parent object when the object is created using the child class.

class A{
	public void show1(){
		System.out.println("In A show");
	};
}
class B extends A{
	public void show2(){
		System.out.println("In B show");
	};
}

public class Upcasting{
	public static void main(String args[]){
		A obj= (A)new B();
		obj.show1(); // In A show
		// In the above command we are casting parent A to B to access the properties of A as well.
	}
}