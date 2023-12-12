package Practice8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;


abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape() {
        Random random = new Random();
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        x = random.nextInt(900);
        y = random.nextInt(900);
    }

    public abstract void draw(Graphics g);
}

