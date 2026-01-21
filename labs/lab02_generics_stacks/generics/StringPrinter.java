/**
 * Individual Printer for String type
 * Demonstrates the non-generic approach - one class per type
 */
public class StringPrinter {
    private String value;

    public StringPrinter(String value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Printing String: " + value);
    }

    public String getValue() {
        return value;
    }
}