/**
 * @author Otto Kyösti
 */
public class Main {
    public static void main(String [] args) {
        
        // This fails because constructor takes three arguments and we are
        // trying to create an object with a constructor that does not exist
        // Point p = new Point();
        // test(p);

        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(1, 2);
        Point p3 = new Point();
        
        System.out.println("x: " + p1.getX() + " y: " + p1.getY() + " z: " + p1.getZ());
        System.out.println("x: " + p2.getX() + " y: " + p2.getY() + " z: " + p2.getZ());
        System.out.println("x: " + p3.getX() + " y: " + p3.getY() + " z: " + p3.getZ());
        
        p1.setX(2);
        p1.setY(5);
        p1.setZ(-3);
        
        System.out.println("x: " + p1.getX() + " y: " + p1.getY() + " z: " + p1.getZ());
        
        // this is false because both p1 and p2 has been created with new keyword
        // so their memory addresses are different
        p2.setX(2);
        p2.setY(5);
        p2.setZ(-3);
        System.out.println(p1.equals(p2));
        
        // these both call p1's toString method and if we haven't written one
        // it is default
        System.out.println(p1.toString());
        System.out.println(p1);
        //p.setX(-1);

    }

    public static void test(Point point) {
        // // Running java Main will output point.x and point.y as 0
        // // When it runs, it also compiles Point.java to class file
        // // And so it has access to it's attributes.
        // System.out.println(point.x + " " + point.y);
        // Point origo1 = new Point();
        // Point origo2 = origo1;
        // origo1.x = 1;
        // origo1.y = 2;
        // System.out.println(origo2.x + " " + origo2.y);
        // // These are the same values as origo1, because saved in origo2
        // // is the same memory address as origo1
        // origo1.printMe();
        // System.out.println(origo1);
        // // You will get the Point class in String form
        // // the output is the result of origo1.toString() method
        // // and if not written defaults to the output seen on terminal
    }
}
