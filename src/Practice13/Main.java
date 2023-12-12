package Practice13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Запись информации в файл
            System.out.print("Введите информацию для записи в файл: ");
            String inputText = readInputText();
            writeToFile("file.txt", inputText);

            // Чтение информации из файла и вывод на экран
            System.out.println("Содержимое файла:");
            String fileContent = readFromFile("file.txt");
            System.out.println(fileContent);

            // Замена информации в файле
            System.out.print("Введите информацию для замены в файле: ");
            String replacementText = readInputText();
            replaceInFile("file.txt", inputText, replacementText);

            // Добавление текста в конец файла
            System.out.print("Введите текст для добавления в конец файла: ");
            String appendedText = readInputText();
            appendToFile("file.txt", appendedText);

            // Повторное чтение и вывод информации из файла
            System.out.println("Итоговое содержимое файла:");
            fileContent = readFromFile("file.txt");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }

    private static String readInputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void writeToFile(String filePath, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        }
    }

    private static String readFromFile(String filePath) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line);
                fileContent.append(System.lineSeparator());
            }
        }
        return fileContent.toString();
    }

    private static void replaceInFile(String filePath, String oldText, String newText) throws IOException {
        String fileContent = readFromFile(filePath);
        fileContent = fileContent.replace(oldText, newText);
        writeToFile(filePath, fileContent);
    }

    private static void appendToFile(String filePath, String textToAppend) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine();
            writer.write(textToAppend);
        }
    }
}
