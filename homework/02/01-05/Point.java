/**
 * @author Otto Kyösti
 * @author Jussi Pohjolainen
 */
public class Point {
    // when these are set to private, direct access by using Point.x is denied
    // and it doesn't show outside of the class
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this(x, y);
        setZ(z);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point() {

    }
    
    public void printMe() {
        System.out.println(this);
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("x cannot be negative");
        }
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("y cannot be negative");
        }
    }

    public int getY() {
        return this.y;
    }

    // It's better to use setters and getters because of readability and 
    // other developers. If this is taken out, code has to be reformatted
    // from Point.setZ() to Point.z = ?? / Point.z can still be changed from 
    // private to public but leaving getters and setters will help other developers
    // working on the same project
    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    public String toString() {
        return "Point: { x: " + getX() + ", y: " + getY() + ", z: " + getZ() + "}";
    }

    public boolean equals(Point p) {
        return (p.getX() == this.x && p.getY() == this.y && p.getZ() == this.z);
    }
}
