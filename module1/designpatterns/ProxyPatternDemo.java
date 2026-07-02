// Subject Interface
interface Image {
    void display();
}

// Real Subject
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

// Proxy
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Create the real object only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Client
public class ProxyPatternDemo {
    public static void main(String[] args) {

        Image image = new ProxyImage("nature.jpg");

        System.out.println("Image created.");
        System.out.println();

        image.display();   // Loads + Displays
        System.out.println();

        image.display();   // Only Displays (already loaded)
    }
}