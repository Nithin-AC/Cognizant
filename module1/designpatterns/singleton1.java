class Singleton {

    // Step 1: Create only one object
    private static Singleton instance = new Singleton();

    // Step 2: Make constructor private
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Step 3: Provide global access
    public static Singleton getInstance() {
        return instance;
    }

    public void display() {
        System.out.println("Hello from Singleton");
    }
}

public class singleton1 {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();

        System.out.println(s1 == s2);
    }
}