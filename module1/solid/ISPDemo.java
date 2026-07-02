interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {

    public void print() {
        System.out.println("Printing...");
    }
}

class AllInOnePrinter implements Printer, Scanner {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class ISPDemo {

    public static void main(String[] args) {

        Printer p = new BasicPrinter();
        p.print();

        AllInOnePrinter a = new AllInOnePrinter();
        a.print();
        a.scan();
    }
}