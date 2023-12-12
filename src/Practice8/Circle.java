package Practice8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Circle extends Shape {
    private int radius;

    public Circle() {
        Random random = new Random();
        radius = random.nextInt(50) + 10;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

