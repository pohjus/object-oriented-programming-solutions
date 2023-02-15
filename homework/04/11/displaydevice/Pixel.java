package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel() {
        System.out.println("Pixel created (default constructor)");
    }

    public Pixel(int x, int y, String color) {
        super(x, y);
        setColor(color);
        System.out.println("Pixel created (parameter constructor)");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // this does not compile because there isn't a printTypo method
    // to override in Point class
    @Override
    public void printTypo() {
        super.print();
        System.out.println(this.color);
    }
}
