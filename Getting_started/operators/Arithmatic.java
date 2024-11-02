// Arithmatic operators are the following:

// Binary Operators
// "+" : addition
// "-" : substraction
// "*" : multiplication
// "/" : Division
// "%" : Remainder (Modules)

// Unary Operators
// "++" : Increment
// "--" : Decrement

public class Arithmatic {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.println("The numbers are: " + a + " and " + b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Sustraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("remainder: " + (a % b));
        System.out.println("After performing increment to " + a + ", it is now " + (++a));
        System.out.println("After performing decrement to " + b + ", it is now " + (++b));
    }

}
