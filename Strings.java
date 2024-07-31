
public class Strings {

    public static void main(String args[]) {
        String name = "Abhilash";
        System.out.println(name);

        // strings are objects in Java.
        //  strings are immutable by default; i.e the values cannot be change every time you want to append new value
        //  it will take new address in heap memory.
        // To comvert the strings to mutable we can use "StringBuffer" & "String Builder"
// STRING BUFFER (by default it occupies the 16chars memory and every time you append the value it keeps the 16 empty buffer size to that
// particular memory address)
        StringBuffer s1 = new StringBuffer("Abhi");
        System.err.println(s1.capacity());  //20
        System.out.println(s1); // Abhi
        s1.insert(4, " Bhosle");
		 System.out.println(s1); // Abhi Bhosle 
    }

}
