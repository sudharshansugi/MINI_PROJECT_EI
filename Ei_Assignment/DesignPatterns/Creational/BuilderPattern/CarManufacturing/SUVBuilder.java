public class SUVBuilder extends CarBuilder {
    @Override
    public SUVBuilder buildEngine(String engine) {
        car.setEngine(engine != null ? engine : "V6 Engine");
        return this;
    }

    @Override
    public SUVBuilder buildColor(String color) {
        car.setColor(color != null ? color : "Black");
        return this;
    }

    @Override
    public SUVBuilder buildWheels(String wheels) {
        car.setWheels(wheels != null ? wheels : "20 inch Alloy Wheels");
        return this;
    }

    @Override
    public SUVBuilder buildInterior(String interior) {
        car.setInterior(interior != null ? interior : "Premium Fabric");
        return this;
    }
}
