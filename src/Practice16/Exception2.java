package Practice16;
import java.util.Scanner;

//public class Exception2 {
//    public void exceptionDemo2() {
//        Scanner myScanner = new Scanner( System.in);
//        System.out.print( "Enter an integer ");
//        String intString = myScanner.next();
//        int i = Integer.parseInt(intString);
//        System.out.println( 2/i );
//    }
//}
//Объясните какие исключения выбрасываются?
//Qwerty: NumberFormatException
//0: ArithmeticException
//1.2: NumberFormatException


public class Exception2 {
    public void exceptionDemo2() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
        } catch (NumberFormatException e) {
            System.out.println("Нецелочисленный ввод!");
            return;
        }
        try {
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}