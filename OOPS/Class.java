class Calculator
{
	public int add(int num1, int num2){
		return num1+num2;
	}
}
 
public class Class
{
	public static void main(String a[]){
		int num1=4;
		int num2=5;
		Calculator calc=new Calculator();
		int result=calc.add(num1,num2);
		System.out.println(result);
	}
}