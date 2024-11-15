//In this file we will try type conversions

public class TypeConversion {
    public static void main(String[] args) {
        // Let's take two variable among which we will perform conversion
        int a = 5;
        float b = 6.67f;
        System.out.println("Before Conversion:");
        System.out.println("Integer: " + a + " and Float: " + b);

        // // Performing integer to float conversion
        float c = (float) a;
        System.out.println("After performing integer to float: ");
        System.out.println("Integer " + a + " Became " + c);

        // // Performing Float to integer conversion
        int d = (int) b;
        System.out.println("After performing float to integer: ");
        System.out.println("Float " + b + " Became " + d + " And lost some values too");

        // // now for an interesting one that is converting to byte
        byte e;
        double f = 129;

        e = (byte) f;
        System.out.println("The double " + f + " Became " + e);

    }
}

// If you see the value of e now, it is a bit weird
// You know why?
// Because when you convert some values into byte, it performs modules operation
// The operation is "result=number%256"
// Which means it divides the number with 256 and stores only the remainder
// since "byte" stores integer type value, it tosses the fraction by default for
// float or double

/*
 * 8 bit representation of 127 : 01111111
 * 8 bit representation of 128 : 10000000
 * 8 bit representation of 255 : 11111111
 * 
 * 10000010 : decimal 130
 * 01111101 : decimal 130 1's compliment
 * +1 :
 * 01111110 : decimal 130 2's compliment : 126
 */