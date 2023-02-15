package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print() {
        System.out.println(this.x + " " + this.y + " " + this.color);
    }
}
