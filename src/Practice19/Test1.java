package Practice19;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

//Написать метод для конвертации массива строк/чисел в список.
public class Test1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> list = arrayToList(array);
        System.out.println(list);
    }

    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}

