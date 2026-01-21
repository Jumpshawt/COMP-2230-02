/**
 * Individual Printer for Double type
 * Demonstrates the non-generic approach - one class per type
 */
public class DoublePrinter {
    private Double value;

    public DoublePrinter(Double value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Printing Double: " + value);
    }

    public Double getValue() {
        return value;
    }
}