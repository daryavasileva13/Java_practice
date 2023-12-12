package Practice16;

import java.util.Scanner;
public class Exception8 {
    public static void getKey8() {
        while (true) {

            System.out.println("Введите строку: ");
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try {
                printDetails8(key);
                break;
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void printDetails8(String key) throws Exception {
        try {
            String message = getDetails8(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails8(String key) throws Exception {
        if (key.compareTo("") == 0) {
            throw new Exception("key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey8();
    }
}