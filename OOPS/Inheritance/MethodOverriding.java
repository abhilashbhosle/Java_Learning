// Overriding the methods of parent class inside child class is called as method overriding.

class A {

    public void show() {
        System.out.println("show in class A");
    }

    public void config() {
        System.out.println("config in class A");
    }
}

class B extends A {
    public void show() { // overriding the method of parent class which is show method.
        System.out.println("show in class B");
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        B obj = new B();

		obj.show();
    }
}
