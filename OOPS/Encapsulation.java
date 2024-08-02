// Encapsulationg the data with methods is called encapsulation.
// Basically it means no one can access the variables of your class from the outside world directly.
// They can get and set thode variables indirectly using methods.
// private key is used to declare variables inside class to make it accessible only in that class.

class Details{
	private String name;
	private int age;

	public String getName(){
		return name;
	}
	public void setName(String a){
		name=a;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age=a;
	}
}

public class Encapsulation{
	public static void main(String[] args) {
		Details obj=new Details();

		obj.setName("bhosle");
		String n=obj.getName();
		obj.setAge(10);
		int a=obj.getAge();

		System.out.println(n +":" + a);
	}
}