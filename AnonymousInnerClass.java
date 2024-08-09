// Ovverriding the method of one class directly while object creation instead of inheriting it to the new class and overriding.
// Anonymous InnerClass does't contain any class name.

class A{
	public void show(){
		System.out.println("Show..");
	}
}
public class AnonymousInnerClass{
	public static void main(String args[]){
		A obj=new A(){ 
			//  overriding the methods of class A
			public void show(){
				System.out.println("Show overriden");
			}
		};
		obj.show();
	}
}