/**
 * Demo showing individual printer classes for each type
 * This demonstrates the non-generic approach with code duplication
 */
public class IndividualPrintersDemo {
    public static void main(String[] args) {
        System.out.println("=== Individual Printer Classes Demo ===\n");

        // Integer printer
        IntegerPrinter intPrinter = new IntegerPrinter(42);
        intPrinter.print();

        // Double printer
        DoublePrinter doublePrinter = new DoublePrinter(3.14159);
        doublePrinter.print();

        // String printer
        StringPrinter stringPrinter = new StringPrinter("Hello, World!");
        stringPrinter.print();

        System.out.println("\n=== Problems with this approach ===");
        System.out.println("Code duplication - 3 separate classes");
        System.out.println("Hard to maintain and extend");
        System.out.println("Not scalable for many types");
        System.out.println("Type-safe but verbose");
    }
}