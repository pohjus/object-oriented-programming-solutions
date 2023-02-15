import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String [] args) {
        Pixel pix = new Pixel();
        Point poi = new Point();
        // this outputs:
        // Point created (default constructor)
        // Pixel created (default constructor)
        // Point created (default constructor)
        // because even though there isn't any code to call
        // Point class' constructor in Pixel class' constructor
        // Java automatically puts super() in a constructor
        // that inherits another class
    }
}
