// If we want to create single abstract method interface we can use functionalInterface.
// In this interface we can able to create only one single interface.

@FunctionalInterface
interface A{
	void show();
	// void run();  // This will throw error as it expects only single method
}

public class Functionalinterface{
	public static void main(String[] args) {
		 A obj=new A(){ // Anonymous inner  class
			public void show(){
				System.out.println("In Show");
			}
		 };
		 obj.show(); 
	}
}