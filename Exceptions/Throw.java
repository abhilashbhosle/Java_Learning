// Since there might be few cases where you want to manually raise the exception even when
// there is a proper response we can use throw keyword to forcefully raise a exception.
// If we throw the exception it enters into the catch block.

public class Throw {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException(); // 18/20 = 0 hence it will throw Arithemetic exception.
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } catch (Exception e) {
            System.out.println("Oops something went wrong.." + e);
        }

        System.out.println(j);

    }
}
