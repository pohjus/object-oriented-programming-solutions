public class Line {
    private Point startingPoint;
    private Point endingPoint;

    public Line(int x1, int y1, int x2, int y2) {
        setStartingPoint(x1, y1);
        setEndingPoint(x2, y2);
    }

    public Line(Point p1, Point p2) {
        setStartingPoint(new Point(p1.getX(), p1.getY()));
        setEndingPoint(new Point(p2.getX(), p2.getY()));
    }

    public void setStartingPoint(int x, int y) {
        this.startingPoint = new Point(x, y);
    }

    public void setStartingPoint(Point p) {
        this.startingPoint = new Point(p.getX(), p.getY());
    }

    public void setEndingPoint(int x, int y) {
        this.endingPoint = new Point(x, y);
    }

    public void setEndingPoint(Point p) {
        this.endingPoint = new Point(p.getX(), p.getY());
    }

    public Point getStartingPoint() {
        return this.startingPoint;
    }

    public Point getEndingPoint() {
        return this.endingPoint;
    }

    public String toString() {
        return this.startingPoint + ", " + this.endingPoint;
    }

    public boolean equals(Line line) {
        return line.getStartingPoint().equals(this.getStartingPoint())
                && line.getEndingPoint().equals(this.getEndingPoint());
    }
}