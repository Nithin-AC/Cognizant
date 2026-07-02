// Shape Interface
interface Shape {
    double area();
}

// Rectangle
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

// Circle
class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

// Client
public class OCPDemo {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 4);
        Shape s2 = new Circle(7);

        System.out.println("Rectangle Area = " + s1.area());
        System.out.println("Circle Area = " + s2.area());
    }
}