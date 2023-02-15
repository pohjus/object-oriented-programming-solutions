package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print() {
        super.print();
        System.out.println(this.color);
    }
}
