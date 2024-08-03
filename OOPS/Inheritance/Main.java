// Inheriting the properties of parent class to the child class is called inheritance;
// In this eg Calc.java is parent class and AdvCalc is child class.
// To inherit we use keyword called extend.

class Main {

    public static void main(String args[]) {
        AdvCalc obj = new AdvCalc();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.sub(7, 6));
        System.out.println(obj.mul(3, 4));
        System.out.println(obj.div(49, 7));

    }
}
