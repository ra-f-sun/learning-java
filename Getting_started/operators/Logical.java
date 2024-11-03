// We will be discussing about Logical operators here
// There are mainly three logical operator
// "&&" : Defines AND
// "||" : Defines OR
// "!" : Defines NOT

public class Logical {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(a + " is less OR equal to " + b);
        System.out.println(a < b || a == b);

        System.out.println(a + " is less-equal AND not equal to " + b);
        System.out.println(a <= b && a != b);
    }

}
