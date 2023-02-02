public class Main {
    public static void main(String [] args) {
        Line line = new Line(5, 5, 10, 10);
        Point a = new Point(0,0);

        line.setStartingPoint(a);
        a.setX(1);
        System.out.println(line);

        Point b = new Point(3, 3);
        Line line2 = new Line(a, b);
        b.setY(5);
        System.out.println(line2);
    }
}