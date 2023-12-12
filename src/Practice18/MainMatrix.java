package Practice18;

public class MainMatrix {
    public static void main(String[] args) {
        Integer[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        Integer[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

        Matrix<Integer> matrixObj1 = new Matrix<>(matrix1);
        Matrix<Integer> matrixObj2 = new Matrix<>(matrix2);

        Matrix<Integer> sumResult = new Matrix<>(new Integer[matrix1.length][matrix1[0].length]);
        Matrix<Integer> subtractionResult = new Matrix<>(new Integer[matrix1.length][matrix1[0].length]);

        matrixObj1.sum(matrixObj2, sumResult);
        matrixObj1.subtraction(matrixObj2, subtractionResult);

        System.out.println("Matrix 1:");
        System.out.println(matrixObj1);

        System.out.println("Matrix 2:");
        System.out.println(matrixObj2);

        System.out.println("Sum result:");
        System.out.println(sumResult);

        System.out.println("Subtraction result:");
        System.out.println(subtractionResult);

        // Calculate determinant
        Integer[][] matrix3 = {{1, 2}, {3, 4}};
        Matrix<Integer> matrixObj3 = new Matrix<>(matrix3);

        Integer determinant = matrixObj3.det();
        System.out.println("Determinant of matrix 3: " + determinant);
    }

}
