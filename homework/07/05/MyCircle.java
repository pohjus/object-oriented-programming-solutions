import java.awt.*;
import java.util.Objects;

public class MyCircle {
    public int getSpeedY() {
        return speedY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    private int speedY;
    private int speedX;
    private int radius;
    private int x;
    private int y;

    private Color color;

    public MyCircle(int x, int y) {
        setX(x);
        setY(y);
        this.radius = (int) ((Math.random() * 60) + 10);
        speedX = (int) (Math.random() * 5) + 1;
        speedY = (int) (Math.random() * 5) + 1;
        this.color = new Color(generateRandomValue(), generateRandomValue(),generateRandomValue());
    }


    public static int generateRandomValue() {
        return (int) (Math.random() * 256);
    }
    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyCircle() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCircle myCircle = (MyCircle) o;
        return radius == myCircle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
