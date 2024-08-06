// The runtime polymorphism is considered as Dynamic method Dispatch.
//Below example for obj refering to class A and C, I'ts output is based on runtime.
// Hence we can consider one object many behaviour which is polymorphism.


class A {
	public void show(){
		System.out.println("In A show");
	}
}
class B extends A{
	public void show(){
		System.out.println("In B show");
	}
}

class C extends B{
	public void show(){
		System.out.println("In C show");
	}
}

public class DynamicMethodDisp{
	public static void main(String args[]){
		A obj=new A();
		obj.show(); // In A show

		obj=new B(); // obj is refering to class B
		obj.show(); // In B show

		obj=new C();  // obj is refering to class C
		obj.show(); // In C show
	}

}