package Practice8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 900;
    private final int FRAME_HEIGHT = 600;
    private final int DELAY = 100;

    private ImageIcon[] frameImages;
    private JLabel frameLabel;
    private int currentFrameIndex;

    public Animation() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Анимация");

        frameImages = new ImageIcon[3]; // Количество кадров анимации

        // Загружаем изображения для каждого кадра анимации
        for (int i = 0; i < frameImages.length; i++) {
            frameImages[i] = new ImageIcon("image" + (i+1) + ".png");
        }

        frameLabel = new JLabel();
        add(frameLabel);

        currentFrameIndex = 0;

        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Обновляем кадр анимации
        currentFrameIndex = (currentFrameIndex + 1) % frameImages.length;
        frameLabel.setIcon(frameImages[currentFrameIndex]);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Animation animation = new Animation();
                animation.setVisible(true);
            }
        });
    }
}
