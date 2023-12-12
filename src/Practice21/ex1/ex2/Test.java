package Practice21.ex1.ex2;

public class Test {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("Привет!");
        queue.enqueue("Как");
        queue.enqueue("дела?");
        System.out.println("Количество элементов в очереди: " + queue.size()); // выводит 3
        System.out.println("Первый элемент: " + queue.element()); // выводит "Hello"
        System.out.println("Удаление и возвращение первого элемента: " + queue.dequeue()); // выводит "Hello"
        queue.clear();
        System.out.println("Очередь пуста: " + queue.isEmpty()); // выводит true
    }
}
