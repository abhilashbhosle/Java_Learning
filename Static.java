// Static variables are the variables which will common for all the objects.
// suppose if we declare static in front of any variable in class it will be applied to all the objects.
// static variables contains different area in JVM.
// value to static variables are assigned directly using their class name.

class Mobile {

	// instance variables
    String brand;
    int price;
    static String name; // applied statics key word to variable name

    public void show() {
        System.out.println(brand + ":" + price + "," + name);
    }
}

public class Static{
	public static void main(String[] args) {
		
		Mobile obj1=new Mobile();

		obj1.brand="Apple";
		obj1.price=67000;
		
		Mobile obj2=new Mobile();

		obj2.brand="Samsung";
		obj2.price=34000;

		Mobile.name="Smart phone";

		obj1.show();
		obj2.show();

	}
} 
