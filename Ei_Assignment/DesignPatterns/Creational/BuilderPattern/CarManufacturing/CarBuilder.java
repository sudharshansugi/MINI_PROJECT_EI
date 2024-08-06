public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public CarBuilder createNewCar() {
        car = new Car();
        return this; // Return the builder instance for chaining
    }

    public abstract CarBuilder buildEngine(String engine);
    public abstract CarBuilder buildColor(String color);
    public abstract CarBuilder buildWheels(String wheels);
    public abstract CarBuilder buildInterior(String interior);
}
