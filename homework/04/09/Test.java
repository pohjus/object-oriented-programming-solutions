import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String [] args) {
        Pixel pix = new Pixel(4, 6, "red");
        System.out.println(pix.getColor());
        System.out.println(pix.getX());
        System.out.println(pix.getY());
    }
}
