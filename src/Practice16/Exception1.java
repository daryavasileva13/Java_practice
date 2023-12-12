package Practice16;

//public class Exception1 {
//    public void exceptionDemo() {
//        System.out.println( 2 / 0 );
//    }
//}
//Ответ: программа даст сбой, и вы получите следующее сообщение
//java.lang.ArithmeticException: / by zero at Exception1.exceptionDemo(Exception1.java:12)
//Это говорит нам о том, что программа пытается выполнить деление на ноль, который он не в состоянии выполнить.



//public class Exception1 {
//    public void exceptionDemo() {
//        System.out.println( 2,0 / 0,0 );
//    }
//}

//Если заменить выражение 2/0 на 2,0 / 0,0, то будет выброшено исключение типа ArithmeticException.
// При этом точка с плавающей запятой не влияет на возникновение исключения. Деление на ноль остается недопустимой операцией
// в арифметике, независимо от типа данных.


public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Попытка деления на ноль");
        }
    }
}