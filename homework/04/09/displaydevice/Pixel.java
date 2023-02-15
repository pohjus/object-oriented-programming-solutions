package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel() {
        System.out.println("Pixel created (default constructor)");
    }

    public Pixel(int x, int y, String color) {
        // if this is not written here, Java will automatically add
        // super() into this constructor and it will call the Point()
        // contructor that does not initialize attributes
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

    public void print() {
        super.print();
        System.out.println(this.color);
    }
}
