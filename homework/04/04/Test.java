import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String [] args) {
        Pixel pix = new Pixel();
        // these attributes are all visible to Pixel and all except color visible
        // to Point, every attribute is not visible to Test class, because they
        // are protected. Test class cannot access x, y and color
        pix.x = 5;
        pix.y = 1;
        pix.color = "red";
        pix.print();

        Point poi = new Point();
        poi.x = 5;
        poi.y = 4;
    }
}
