package Practice16;
import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo3() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод");
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
