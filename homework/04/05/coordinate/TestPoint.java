package coordinate;

class TestPoint {
    public static void main(String [] args) {
        // this class has access to Point class' attributes because they
        // are protected and TestPoint class is in the same package as Point
        Point a = new Point();
        a.x = 4;
        a.y = 10;
    }
}