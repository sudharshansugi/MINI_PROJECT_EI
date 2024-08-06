public class SportsCarBuilder extends CarBuilder {
    @Override
    public SportsCarBuilder buildEngine(String engine) {
        car.setEngine(engine != null ? engine : "V8 Engine");
        return this;
    }

    @Override
    public SportsCarBuilder buildColor(String color) {
        car.setColor(color != null ? color : "Red");
        return this;
    }

    @Override
    public SportsCarBuilder buildWheels(String wheels) {
        car.setWheels(wheels != null ? wheels : "18 inch Alloy Wheels");
        return this;
    }

    @Override
    public SportsCarBuilder buildInterior(String interior) {
        car.setInterior(interior != null ? interior : "Leather");
        return this;
    }
}
