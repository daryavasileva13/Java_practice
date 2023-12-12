package Practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int a = scanner.nextInt();

        System.out.print("Введите число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            printNumbersAsc(a, b);
        } else {
            printNumbersDesc(a, b);
        }
    }

    public static void printNumbersAsc(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            printNumbersAsc(a + 1, b);
        }
    }

    public static void printNumbersDesc(int a, int b) {
        if (a >= b) {
            System.out.print(a + " ");
            printNumbersDesc(a - 1, b);
        }
    }
}
