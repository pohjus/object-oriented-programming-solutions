package coordinate;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("Point created (default constructor)");
    }

    public void print() {
        System.out.println(this.x);
        System.out.println(this.y);
    }
}