package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel() {
        System.out.println("Pixel created (default constructor)");
    }

    public void print() {
        super.print();
        System.out.println(this.color);
    }
}
