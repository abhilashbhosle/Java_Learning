// In java whenever the constructor is created super method is by default method enclosed inside it.
// In case of super class and sub classes whenever we create the object using sub class it calls the
	// super class constructor as well.
// But what if the super class constructor has one default and parameterised constructor?
// By default only default constructor is called, but when we pass the arg to super inside subclass 
	// parameterized constructor the parameterised constructor of super class is called.
// Below is an example of super class "A" and sub class "B".

class A{
	public A(){
		System.out.println("default A constructor is called");
	}
	public A(int a){
		System.out.println("parameterised constuctor of A is called");
	}
}

class B extends A{
	public B(){
		System.out.println("default B constructor is called");
	}
	public B(int a){
		super(a); // if parameter is not passed in super, the default A constructor would have called;
		System.out.println("parameterised constuctor of B is called");
	}
}

public class Super{
	public static void main(String a[]){
		B obj=new B(9);
		B obj1=new B();
	}
}