class Bird {
    void move() {
        System.out.println("Bird is moving");
    }
}

class Sparrow extends Bird {
    void move() {
        System.out.println("Sparrow is flying");
    }
}

public class LSPDemo {
    public static void main(String[] args) {

        Bird bird = new Sparrow();

        bird.move();
    }
}