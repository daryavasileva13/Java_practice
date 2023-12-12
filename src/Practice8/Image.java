package Practice8;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image {
    public static void main(String[] args) {
        // Создание окна
        JFrame frame = new JFrame();
        frame.setSize(1200, 1200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание метки
        JLabel label = new JLabel();

        // Путь к изображению
        String imagePath = "/Users/daryavasileva/Downloads/cat1.png";

        // Создание иконки из изображения
        ImageIcon icon = new ImageIcon(imagePath);

        // Установка иконки для метки
        label.setIcon(icon);

        // Добавление метки в окно
        frame.getContentPane().add(label);

        // Отображение окна
        frame.setVisible(true);
    }
}



