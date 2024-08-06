public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        // Optionally, additional steps can be added here
        // Currently, all properties are set directly via user input
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}
