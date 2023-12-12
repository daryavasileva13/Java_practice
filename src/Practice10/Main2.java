package Practice10;

import java.util.Scanner;

public class Main2 {
    public static int countNumbers(int k, int s) {
        // Базовый случай: если натуральное число состоит из одной цифры (k = 1),
        // то количество чисел с суммой цифр равной s будет равно 1, если s в диапазоне от 1 до 9, иначе 0.
        if (k == 1) {
            return (s >= 1 && s <= 9) ? 1 : 0;
        }

        int count = 0;

        // Рекурсивно вызываем функцию для поиска (k - 1)-значных чисел с суммой цифр, равной s - digit,
        // где digit - цифра, стоящая на первой позиции.
        for (int digit = 0; digit <= 9; digit++) {
            if (s - digit >= 0) {
                count += countNumbers(k - 1, s - digit);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число – количество цифр в числе: ");
        int k = scanner.nextInt();  // количество цифр в числе

        System.out.print("Введите число – сумму цифр: ");
        int s = scanner.nextInt();  // сумма цифр


        int result = countNumbers(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр, равной " + s + ": " + result);
    }
}

