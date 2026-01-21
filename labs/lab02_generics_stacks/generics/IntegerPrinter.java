/**
 * Individual Printer for int type (primitive)
 * Demonstrates the non-generic approach - one class per type
 */
public class IntegerPrinter {
    private int value;

    public IntegerPrinter(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Printing int: " + value);
    }

    public int getValue() {
        return value;
    }
}
