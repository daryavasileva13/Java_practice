package Practice8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Rectangle extends Shape {
    private int width, height;

    public Rectangle() {
        Random random = new Random();
        width = random.nextInt(100) + 10;
        height = random.nextInt(100) + 10;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}


