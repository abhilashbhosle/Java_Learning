
class A {

    public void show1() {
        System.out.println("In A show");
    }
;

}
class B extends A {

    public void show2() {
        System.out.println("In B show");
    }
;

}

public class Downcasting {

    public static void main(String args[]) {
        A obj = (A) new B();
        obj.show1(); // In A show
        // In the above command we are casting parent A to B to access the properties of A as well.

        // eg of down casting where obj1 is refering to A obj; to access the properties of b we are casting it to child B as well;
        B obj1 = (B) obj;
        obj1.show2();
    }
}
