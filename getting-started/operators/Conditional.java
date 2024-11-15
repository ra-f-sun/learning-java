// We will be discussing conditional operators here
// There are several conditional operators. Those are:
// "==" : Defines whether two values are equal or not
// "!=" : Defines whether two values are not equal or not(means equal)
// ">" : Greater than or not
// "<" : Less than or not
// ">=" : (Greater or equal) or not
// "<=" : (Less or equal) or not

public class Conditional {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Checking equal.
        System.out.println(a + " and " + b + " is equal");
        System.out.println(a == b);

        // Checking not equal
        System.out.println(a + " and " + b + " is not equal");
        System.out.println(a != b);

        // Checking greater
        System.out.println(a + " is greater than " + b);
        System.out.println(a > b);

        // Checking Lesser
        System.out.println(a + " is less than " + b);
        System.out.println(a < b);

        // Checking greater or equal
        System.out.println(a + " is greater or equal to " + b);
        System.out.println(a >= b);

        // Checking Less or equal
        System.out.println(a + " is less or equal to " + b);
        System.out.println(a <= b);
    }
}

// Remember that, Whenever checking conditional operators,
// it will always answer with only true or false.
// In other terms, it returns boolean value