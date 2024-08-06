public class Car {
    private String engine;
    private String color;
    private String wheels;
    private String interior;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", color=" + color + ", wheels=" + wheels + ", interior=" + interior + "]";
    }
}
