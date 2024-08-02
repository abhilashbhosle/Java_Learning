// Every time we create the object they are two steps involved:
// 1. The class loads 2. the objects are instantiated.
// But the thing is class load only once in the area class loader present inside JVM.
// And objects are loaded the number of times the objects are created.
// since the class loader loads only once the static block also load once.

class Mobile {

	// instance variables
    String brand;
    int price;
    static String name; // applied statics key word to variable name

	public Mobile(){
		brand="";
		price=70;

		System.out.println("object is called"); // we can see this printing twice since 2obj are created
	}

	static {
		name="Phone";
		System.out.println("Static block is called"); // called only once.
	}

    public void show() {
        System.out.println(brand + ":" + price + "," + name);
    }
}

public class StaticBlock{
	public static void main(String[] args) {
		
		Mobile obj1=new Mobile();

		obj1.brand="Apple";
		obj1.price=67000;
		
		Mobile obj2=new Mobile();

	}
} 