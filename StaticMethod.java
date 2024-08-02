// Static methods can be directly accessible with class name.

class Mobile {

	// instance variables
    String brand;
    int price;
    static String name; // applied static key word to variable name

	public static void show1(Mobile obj){
		System.out.println(obj.brand + ":" + obj.price + "," + name);
	}

    public void show() {
        System.out.println(brand + ":" + price + "," + name);
    }
}

public class StaticMethod{
	public static void main(String[] args) {
		
		Mobile obj1=new Mobile();

		obj1.brand="Apple";
		obj1.price=67000;
		
		Mobile obj2=new Mobile();

		obj2.brand="Samsung";
		obj2.price=34000;

		Mobile.name="Smart phone";

		Mobile.show1(obj1);// static method directly called using class names.


	}
} 