import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MyWindow extends JFrame {
    private MyPaintArea area;
    public MyWindow() {
        super("My Drawing app");
        area = new MyPaintArea();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                area.addCircle(e.getX(), e.getY());
            }
        });

        addMouseWheelListener(area::move);

        add(area);
        setSize(800,800);
        setVisible(true);
    }
}
