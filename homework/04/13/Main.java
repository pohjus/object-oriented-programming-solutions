import coordinate.Point;
import displaydevice.Pixel;

public class Main {
    public static void main(String [] args) {
        Point poi = new Point(5, 2);
        Pixel pix = new Pixel(4, 1, "red");
        method1(poi /* or pix */);
        method2(pix);
        method3(pix /* or poi, or any class that inherits Object (which is all classes) */);
    }
    public static void method1(Point point) {
        // point.whatMethodsCanIUse();
        point.setX(19);
        point.setY(12); 
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.print();
        // + all methods Object class has
    }
    public static void method2(Pixel pixel) {
        // pixel.whatMethodsCanIUse();
        pixel.setX(33);
        pixel.setY(22);
        pixel.setColor("blue");
        System.out.println(pixel.getX());
        System.out.println(pixel.getY());
        System.out.println(pixel.getColor());
        pixel.print();
        // + all methods Object class has
    }
    public static void method3(Object object) {
        // object.whatMethodsCanIUse();
        // only methods that object has (toString, equals etc.)
    }
}
