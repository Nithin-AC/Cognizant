class Laptop {

    private String processor;
    private int ram;
    private int storage;

    public Laptop(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void display() {
        System.out.println("Processor : " + processor);
        System.out.println("RAM       : " + ram + " GB");
        System.out.println("Storage   : " + storage + " GB");
    }
}

class LaptopBuilder {

    private String processor;
    private int ram;
    private int storage;

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Laptop build() {
        return new Laptop(processor, ram, storage);
    }
}

public class builder {

    public static void main(String[] args) {

        Laptop laptop = new LaptopBuilder()
                .setProcessor("Intel i7")
                .setRAM(16)
                .setStorage(512)
                .build();

        laptop.display();
    }
}