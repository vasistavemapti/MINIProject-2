package org.example;
public class Overloading{

    // Method with same name but different parameter types
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(float num) {
        System.out.println("Printing float: " + num);
    }

    public void print(String str) {
        System.out.println("Printing string: " + str);
    }

    // Method with different number of parameters
    public void print(int num1, int num2) {
        System.out.println("Printing two integers: " + num1 + " and " + num2);
    }

    public void print(int num1, int num2, int num3) {
        System.out.println("Printing three integers: " + num1 + ", " + num2 + ", and " + num3);
    }

    // Method with different parameter order
    public void print(String str, int num) {
        System.out.println("Printing string and integer: " + str + ", " + num);
    }

    public void print(int num, String str) {
        System.out.println("Printing integer and string: " + num + ", " + str);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.print(5);           // prints "Printing integer: 5"
        obj.print(5.5f);        // prints "Printing float: 5.5"
        obj.print("Hello");     // prints "Printing string: Hello"
        obj.print(10, 20);      // prints "Printing two integers: 10 and 20"
        obj.print(10, 20, 30);  // prints "Printing three integers: 10, 20, and 30"
        obj.print("Hello", 5);  // prints "Printing string and integer: Hello, 5"
        obj.print(5, "Hello");  // prints "Printing integer and string: 5, Hello"
    }
}
