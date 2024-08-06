import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of car you want to build:");
        System.out.println("1. Sports Car");
        System.out.println("2. SUV");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        CarBuilder builder;
        if (choice == 1) {
            builder = new SportsCarBuilder();
        } else {
            builder = new SUVBuilder();
        }

        // Ask user for customizations
        System.out.println("Enter the engine type:");
        String engine = scanner.nextLine();
        System.out.println("Enter the color:");
        String color = scanner.nextLine();
        System.out.println("Enter the wheel type:");
        String wheels = scanner.nextLine();
        System.out.println("Enter the interior type:");
        String interior = scanner.nextLine();

        // Set user inputs into the car using the builder pattern
        builder.createNewCar()
               .buildEngine(engine)
               .buildColor(color)
               .buildWheels(wheels)
               .buildInterior(interior);

        // Construct and retrieve the car
        CarDirector director = new CarDirector(builder);
        director.constructCar();
        Car car = director.getCar();

        System.out.println("Car built: " + car);
    }
}