package Practice10;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int n = scanner.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}
