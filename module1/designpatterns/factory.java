interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

class VehicleFactory {

    public Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car"))
            return new Car();

        if (type.equalsIgnoreCase("bike"))
            return new Bike();

        return null;
    }
}

public class factory {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle1 = factory.getVehicle("car");
        vehicle1.start();

        Vehicle vehicle2 = factory.getVehicle("bike");
        vehicle2.start();
    }
}