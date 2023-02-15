import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String [] args) {
        Pixel pix = new Pixel();
        // these don't work because variables x and y are private, which means ONLY
        // Point class which Pixel inherits can see them
        // pix.x = 5;
        // pix.y = 1;
        // pix.color = "red";
        pix.print();
    }
}
