import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class MyWindow extends JFrame {
    private JButton clearButton;
    private JButton addButton;
    private JTextArea textArea;

    public MyWindow(String title, int h, int w) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(h, w);
        setClearButton(new JButton("clear"));
        setAddButton(new JButton("add text"));
        setTextArea(new JTextArea("TextArea"));
        setTextStyle();
        setVisible(true);
    }

    public void setClearButton(JButton b) {
        this.clearButton = b;
        this.clearButton.addActionListener(this::clearButtonClicked);
        add(this.clearButton, BorderLayout.NORTH);
    }
    
    public void setAddButton(JButton b) {
        this.addButton = b;
        this.addButton.addActionListener(this::addButtonClicked);
        add(this.addButton, BorderLayout.SOUTH);
    }

    public void setTextArea(JTextArea t) {
        this.textArea = t;
    }

    public void setTextStyle() {
        this.textArea.setFont(textArea.getFont().deriveFont(24f));
        this.textArea.setBackground(new Color(173, 216, 230));
        add(this.textArea, BorderLayout.CENTER);
    }

    public void clearButtonClicked(ActionEvent e) {
        this.textArea.setText("");
    }

    public void addButtonClicked(ActionEvent e) {
        this.textArea.setText("TextArea");
    }
}