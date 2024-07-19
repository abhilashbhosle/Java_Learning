class Operators{
	public static void main(String args[]){
		// post increment
		int num1=7;
		int result1=num1++; // op- 7 as post inc first fetch the value and then increment
		System.out.println(result1);

		// pre increment
		int num2=7;
		int result2 =++num2; // op- 8 as pre inc first increment the value of num and then fetch 

		System.out.println(result2);
	}
}