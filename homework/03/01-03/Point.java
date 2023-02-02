public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "[x = " + getX() + ", y = " + getY() + "]";
    }

    @Override
    public boolean equals(Object o) {
        Point p = (Point) o; // TODO: better checking for type errors.
        return p.getX() == this.getX() && p.getY() == this.getY();
    }
}