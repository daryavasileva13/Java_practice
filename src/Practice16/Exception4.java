package Practice16;
import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo4() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число ");
        String intString = myScanner.next();
        int i = 2;
        try {
            i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод!");
        } finally {
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Попытка деления на ноль");
            }
        }
    }

}
