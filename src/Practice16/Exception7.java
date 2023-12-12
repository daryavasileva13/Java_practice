package Practice16;
import java.util.Scanner;

//public class Exception7 {
//    public static void getKey7() {
//        Scanner myScanner = new Scanner(System.in);
//        String key = myScanner.next();
//        try {
//            printDetails7(key);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void printDetails7(String key) throws Exception {
//        try {
//            String message = getDetails7(key);
//            System.out.println(message);
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//
//    private static String getDetails7(String key) throws Exception {
//        if (key.compareTo("") == 0) {
//            throw new Exception("key set to empty string");
//        }
//        return "data for " + key;
//    }
//
//}


public class Exception7 {
    public static void getKey7() {
        System.out.println("Введите строку: ");
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails7(key);
    }

    public static void printDetails7(String key) {
        try {
            String message = getDetails7(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails7(String key) {
        if (key.compareTo("") == 0) {
            try {
                throw new Exception("key set to empty string");
            } catch (Exception e) {
                System.out.println(e + " catched");
            }
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey7();
    }
}