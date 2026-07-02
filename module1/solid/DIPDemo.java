// Abstraction
interface Keyboard {
    void type();
}

// Low-level module
class WiredKeyboard implements Keyboard {

    public void type() {
        System.out.println("Typing with Wired Keyboard");
    }
}

// Another implementation
class WirelessKeyboard implements Keyboard {

    public void type() {
        System.out.println("Typing with Wireless Keyboard");
    }
}

// High-level module
class Computer {

    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
    }
}

public class DIPDemo {

    public static void main(String[] args) {

        Keyboard keyboard = new WirelessKeyboard();

        Computer computer = new Computer(keyboard);

        computer.start();
    }
}