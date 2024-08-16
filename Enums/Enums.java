// Enums are the named constants.

enum Status {
    Pending, Success, Failed;
}

public class Enums { 
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println(s);
    }
}
