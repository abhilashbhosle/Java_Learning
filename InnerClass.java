// The InnerClass can also called as nested class.
// To access this inner class we need to refer the parent class.

class A {

    public void show() {
        System.out.println("Show..");
    }

    class B {

        public void config() {
            System.out.println("Config..");
        }
    }
}

public class InnerClass {

    public static void main(String args[]) {
        A obj = new A();
        obj.show();

        // While creating the object of B we need to refer to obj as well because the B is inside A.
        A.B obj1 = obj.new B();
        obj1.config();

    }
}
