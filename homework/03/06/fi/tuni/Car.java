package fi.tuni;

public class Car {
    private String brand;
    private Engine engine;

    public Car (String brand, int horsePower) {
        setBrand(brand);
        setEngine(horsePower);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(int horsePower) {
        this.engine = new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", engine = " + engine;
    }

}