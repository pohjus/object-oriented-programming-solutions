package fi.tuni;

public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        setHorsePower(horsePower);
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            throw new IllegalArgumentException("horse power cannot be negative");
        }
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Engine: horsepower = " + horsePower;
    }
}