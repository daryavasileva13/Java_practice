package Practice19;

///Реализовать метод, который возвращает любой элемент массива по индексу.

public class Test2<T> {
    private T[] array;
    public Test2(T[] array) {
        this.array = array;
    }
    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Test2<Integer> ex_2 = new Test2<>(integers);
        System.out.println(ex_2.getElement(2)); // Output: 3

        String[] strings = {"Всем", "привет!", "Как", "дела?"};
        Test2<String> ex_2_2 = new Test2<>(strings);
        System.out.println(ex_2_2.getElement(1)); // Output: "World"
    }
}