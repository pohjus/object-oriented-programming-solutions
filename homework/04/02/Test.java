public class Test {
    public static void main(String [] args) {
        Point po = new Point();
        Pixel pi = new Pixel();
        System.out.println(po.x);
        System.out.println(po.y);
        System.out.println(pi.x);
        System.out.println(pi.y);
        System.out.println(pi.color);
        pi.print();
    }
}
