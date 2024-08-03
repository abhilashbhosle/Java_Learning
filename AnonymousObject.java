// The object which doesn't have reference variable or the objects with no name are called Anonymous objects;

class Name{
	Name(){
		System.out.println("Object created");
	}
}

public class AnonymousObject{
	public static void main(String args[]){
		new Name();
	}
}
