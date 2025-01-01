package Java;

import java.math.BigInteger;

public class BigInteger_notes {

    public static void main(String[] args) {
        
        // BigInteger is used to handle very large integers that cannot fit into int or long.
        // It is part of the java.math package and is immutable.

        // Creating BigInteger
        BigInteger a = new BigInteger("12345678901234567890"); // From a String
        BigInteger b = BigInteger.valueOf(9876543210L);       // From a long value

        // Arithmetic Operations
        System.out.println("Addition: " + a.add(b));         // Adds a + b
        System.out.println("Subtraction: " + a.subtract(b)); // Subtracts a - b
        System.out.println("Multiplication: " + a.multiply(b)); // Multiplies a * b
        System.out.println("Division: " + a.divide(b));      // Divides a / b
        System.out.println("Modulus: " + a.mod(b));          // Remainder of a / b

        // Comparison
        System.out.println("Comparison (a vs b): " + a.compareTo(b)); // -1 if a < b, 0 if a == b, 1 if a > b
        System.out.println("Are a and b equal? " + a.equals(b));      // Checks equality

        // Bitwise Operations
        System.out.println("Bitwise AND: " + a.and(b)); // Performs bitwise AND
        System.out.println("Bitwise OR: " + a.or(b));   // Performs bitwise OR
        System.out.println("Bitwise XOR: " + a.xor(b)); // Performs bitwise XOR

        // Other Utilities
        System.out.println("GCD: " + a.gcd(b));                // Finds greatest common divisor
        System.out.println("Power (a^2): " + a.pow(2));        // Raises a to the power of 2
        System.out.println("Absolute value: " + a.abs());      // Returns absolute value
        System.out.println("Negate: " + a.negate());           // Negates the value
        System.out.println("Is a Prime? " + a.isProbablePrime(1)); // Checks if a is prime

        // Conversion
        System.out.println("BigInteger to String: " + a.toString()); // Converts to String
        System.out.println("BigInteger to int: " + a.intValue());    // Converts to int
        System.out.println("BigInteger to long: " + a.longValue());  // Converts to long

        // Important Notes:
        // 1. BigInteger is immutable; every operation returns a new BigInteger.
        // 2. Use BigInteger for calculations where precision and large values matter.
    }
}
