package Practice8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JPanel {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;

    private Shape[] shapes;

    public Main() {
        shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Rectangle();
            } else {
                shapes[i] = new Circle();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Main panel = new Main();
        frame.add(panel);

        frame.setVisible(true);
    }
}
