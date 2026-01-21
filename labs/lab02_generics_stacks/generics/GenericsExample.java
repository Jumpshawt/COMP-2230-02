import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Lab 02: Generics Demo - Printer Objects for int, double, and string
 *
 * This demonstrates creating generic Printer objects for different types.
 */

public class GenericsExample {

    /**
     * Generic Printer class that can print any type of object.
     */
    static class Printer<T> {
        public void print(T item) {
            System.out.println("Printing " + item.getClass().getSimpleName() + ": " + item);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Generics Demo: Printer Objects ===\n");

        // Create printer object for int
        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.print(42);

        // Create printer object for double
        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.print(3.14159);

        // Create printer object for string
        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.print("Hello, Generics!");

        System.out.println("\n=== Benefits of Generics ===");
        System.out.println("One Printer class works for all types");
        System.out.println("Type-safe at compile time");
        System.out.println("No code duplication");
    }
}