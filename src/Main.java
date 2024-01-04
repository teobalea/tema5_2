public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Audi", "A6", 2022, 4);
        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Number of Doors: " + myCar.getNumberOfDoors());
        System.out.println();

        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, false);
        System.out.println("Motorcycle Details:");
        System.out.println("Brand: " + myMotorcycle.getBrand());
        System.out.println("Model: " + myMotorcycle.getModel());
        System.out.println("Year: " + myMotorcycle.getYear());
        System.out.println("Has Sidecar: " + myMotorcycle.hasSideCar());
    }
}
