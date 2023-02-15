package coordinate;

public class Point {
    private int x;
    private int y;

    // public Point() {
    //     System.out.println("Point created (default constructor)");
    // }

    public Point(int x, int y) {
        setX(x);
        setY(y);
        System.out.println("Point created (parameter constructor)");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void print() {
        System.out.println(this.x);
        System.out.println(this.y);
    }
}