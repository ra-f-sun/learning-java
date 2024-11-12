// Polymorphism simply refers to different methods with same name.
// we have 2 types of polymorphism
// 1. Compile time polymorphism (method overloading)
// 2. Run time polymorphism (Method overriding)
// Here we will discuss method overloading and method overriding will be discussed in Inheritance

class Calculator {

    // We are having a method named "add" without parameters
    public void add() {
        System.out.println("this is void method");
        System.out.println("this will not return anything");
    }

    // We are having another method with the same name as "add"
    // But with parameters
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // We are having another method with the same name as "add"
    // But with parameters which are different from the previous one
    public float add(float n3, float n4) {
        return n3 + n4;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add();
        int resultInt = calc.add(5, 6);
        float resultFloat = calc.add(6.78f, 645.22f);

        System.out.println(resultInt);
        System.out.println(resultFloat);
    }
}