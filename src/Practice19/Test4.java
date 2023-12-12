package Practice19;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Футболка\n" +
                "Платье\n" +
                "Куртка\n" +
                "Шорты\n" +
                "Юбка\n" +
                "Носки\n" +
                "Кепка\n" +
                "Шапка\n" +
                "Джинсы\n" +
                "Худи\n" +
                "Брюки";
        try {
            String path = "Pr_19_4.txt";
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.close();
            Main4 testCatalog = new Main4();
            testCatalog.Catalog(path);
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}