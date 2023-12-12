package Practice17;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Создание заказа\nВведите ваше имя: ");
        String name = read.next();
        System.out.println("Введите ИНН: ");
        String INN = read.next();
        User user = new User(name, INN);
        try {
            user.checkINN();
        } catch (IncorrectINN err) {
            System.out.println("ИНН неверный");
        }
    }
}
