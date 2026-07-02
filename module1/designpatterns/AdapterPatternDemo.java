// Existing class (can't be modified)
class OldPrinter {
    public void oldPrint(String text) {
        System.out.println("Old Printer: " + text);
    }
}

// Target Interface (what the client expects)
interface Printer {
    void printDocument(String text);
}

// Adapter
class PrinterAdapter implements Printer {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(String text) {
        // Convert new request into old request
        oldPrinter.oldPrint(text);
    }
}

// Client
public class AdapterPatternDemo {
    public static void main(String[] args) {

        // Old object
        OldPrinter oldPrinter = new OldPrinter();

        // Adapter makes it compatible
        Printer printer = new PrinterAdapter(oldPrinter);

        // Client uses the new interface
        printer.printDocument("Hello Adapter Pattern!");
    }
}