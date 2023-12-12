package Practice18;

public class MainMinMaxCalculator {
    public static void main(String[] args) {
        Integer[] intArray = {1, 5, 3, 8, 6};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min value: " + intMinMax.findMin());
        System.out.println("Max value: " + intMinMax.findMax());

        Double[] doubleArray = {1.5, 3.2, 4.7, 2.5};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Min value: " + doubleMinMax.findMin());
        System.out.println("Max value: " + doubleMinMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 3.2));
        System.out.println("Multiplication: " + Calculator.multiply(4, 2.5));
        System.out.println("Division: " + Calculator.divide(5.5, 2));
        System.out.println("Subtraction: " + Calculator.subtraction(7, 3.5));
    }
}
