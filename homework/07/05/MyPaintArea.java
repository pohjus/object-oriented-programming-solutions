import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class MyPaintArea extends JPanel {
    public boolean animate = false;

    List<MyCircle> circles = new ArrayList<MyCircle>();

    public MyPaintArea() {
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        circles.forEach(c -> {
            g.setColor(c.getColor());
            g.fillOval(c.getX() - c.getRadius(), c.getY() - c.getRadius() * 2,c.getRadius() * 2, c.getRadius() * 2);
        });

    }


    public void addCircle(int x, int y) {
        if (!animate) {
            animate = true;
            startAnimation();
        }
        circles.add(new MyCircle(x, y));
    }

    public void handleXBounce(MyCircle c) {
        if(c.getX() < c.getRadius()) {
            c.setX(c.getRadius());
            c.setSpeedX(c.getSpeedX() * -1);
        }
        if(c.getX() > this.getWidth() - c.getRadius()) {
            c.setX(this.getWidth() - c.getRadius());
            c.setSpeedX(c.getSpeedX() * -1);
        }
    }
    private void handleYBounce(MyCircle c) {
        if(c.getY() < c.getRadius()) {
            c.setY(c.getRadius());
            c.setSpeedY(c.getSpeedY() * -1);
        }

        if(c.getY() > this.getHeight()) {
            c.setY(this.getHeight());
            c.setSpeedY(c.getSpeedY() * -1);
        }
    }

    private void animate() {
        while(animate) {
            for(MyCircle c : circles) {
                handleXBounce(c);
                handleYBounce(c);
                c.setX(c.getX() + c.getSpeedX());
                c.setY(c.getY() + c.getSpeedY());
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();
        }
    }
    public void startAnimation() {
        new Thread(this::animate).start();
    }

    public void move(MouseWheelEvent mouseWheelEvent) {
        System.out.println( mouseWheelEvent.getWheelRotation());
        circles.forEach(circle ->
                circle.setRadius(circle.getRadius() + mouseWheelEvent.getWheelRotation()));

        repaint();
    }
}
