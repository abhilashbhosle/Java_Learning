// We can create our own exceptions in java.
class AbhiException extends Exception{

   public AbhiException(String str) {
		super(str);
    }
}

public class MyException {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new AbhiException("my custom exception");
            }
        } catch (AbhiException e) {
            System.out.println("Cannot divide by zero" + e);
        } catch (Exception e) {
            System.out.println("Oops something went wrong.." + e);
        }

        System.out.println(j);

    }
}
