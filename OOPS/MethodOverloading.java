// method overloading in java is considered as the same methods having the different parameters.

class Calculator{
	public int add(int a, int b){
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}
	public double add(double a, int b){
		return a+b;
	}
}


public class MethodOverloading{
	public static void main(String a[]){
		int num1=2;
		int num2=3;
		Calculator calc=new Calculator();
		int result=calc.add(num1,num2);
		System.out.println(result);
	}
}