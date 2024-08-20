// Exceptions are nothing but run time errors.
// Whenever the expception is thrown execution gets stop, and it effects remaining code from execution.
// We need to handle the exceptions using try and catch block.

public class Exceptions {

    public static void main(String[] args) {
		int arr[]=new int[5];
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
			System.out.println(arr[5]); // throws ArrayIndexOutOfBoundsException exception as arr[5] is limited to 4.
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } 
		 catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot divide by zero" + e);
        } 
		catch (Exception e) {
            System.out.println("Oops something went wrong.." + e);
        }

        System.out.println(j);

    }
}
