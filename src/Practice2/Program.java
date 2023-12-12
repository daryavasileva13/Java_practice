//package Practice2;
//import java.util.Arrays;
//import java.util.Random;
//
//public class Program {
//    public static void main(String[] args){
//
//        System.out.println("Вывести на экран сумму чисел массива с помощью циклов for, while, do while.");
//
//        int []arr = new int [10];
//
//        for (int i = 0; i < 10; i++){
//            arr[i] = (int) (Math.random()*10);
//        }
//
//        System.out.println("Массив:");
//        for (int i = 0; i < 10; i++){
//            System.out.println(arr[i]);
//        }
//
//        int sum1 = 0;
//        for (int i = 0; i < 10; i++){
//            sum1 += arr[i];
//        }
//        System.out.println("Сумма с помощью цикла for = " + sum1);
//
//        int i = 0;
//        int sum2 = 0;
//        while (i < 10){
//            sum2 += arr[i];
//            i += 1;
//        }
//        System.out.println("Сумма с помощью цикла while = " + sum2);
//
//        int i2 = 0;
//        int sum3 = 0;
//        do{
//            sum3 += arr[i2];
//            i2 += 1;
//        } while (i2 < 10);
//        System.out.println("Сумма с помощью цикла do while = " + sum3);
//
//
//        //System.out.println("Задание 2. Вывести на экран аргументы командной строки в цикле for.");
//
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//
//
//        System.out.println("Вывести на экран первые 10 чисел гармонического ряда.");
//
//        for (int k = 1; k <= 10; k++) {
//            double harmonicNumber = 1.0 / k;
//            System.out.println("Число гармонического ряда #" + k + ": " + harmonicNumber);
//        }
//
//        // Создание генератора случайных чисел
//        Random random = new Random();
//
//        // Создание и заполнение массива случайными числами
//        int[] numbers = new int[10];
//        for (int z = 0; z < numbers.length; z++) {
//            numbers[z] = random.nextInt(100); // Генерация случайного числа от 0 до 99
//        }
//
//        // Вывод исходного массива на экран
//        System.out.println("Исходный массив: " + Arrays.toString(numbers));
//
//        // Сортировка массива
//        Arrays.sort(numbers);
//
//        // Вывод отсортированного массива на экран
//        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
//
//
//
//
//        System.out.println("Вычислить факториал");
//        int number = 5; // Число, для которого нужно вычислить факториал
//        long factorial = calculateFactorial(number);
//        System.out.println("Факториал числа " + number + " равен: " + factorial);
//    }
//
//    public static long calculateFactorial(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Число должно быть положительным или нулём.");
//        }
//
//        long factorial = 1;
//
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//
//        return factorial;
//
//
//    }
//}
