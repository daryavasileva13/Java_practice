package Practice21.ex1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Класс ArrayQueue:");
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Количество элементов в очереди: " + queue.size()); // выводит 3
        System.out.println("Первый элемент: " + queue.element()); // выводит 1
        System.out.println("Удаление и возвращение первого элемента: " + queue.dequeue()); // выводит 1
        queue.clear();
        System.out.println("Очередь пуста: " + queue.isEmpty()); // выводит true

        System.out.println("\nКласс ArrayQueueADT:");
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueADT.create(queue1, 5);
        ArrayQueueADT.enqueue(queue1, 1);
        ArrayQueueADT.enqueue(queue1, 2);
        ArrayQueueADT.enqueue(queue1, 3);
        System.out.println("Количество элементов в очереди: " + ArrayQueueADT.size(queue1)); // выводит 3
        System.out.println("Первый элемент: " + ArrayQueueADT.element(queue1)); // выводит 1
        System.out.println("Удаление и возвращение первого элемента: " + ArrayQueueADT.dequeue(queue1)); // выводит 1
        ArrayQueueADT.clear(queue1);
        System.out.println("Очередь пуста: " + ArrayQueueADT.isEmpty(queue1)); // выводит true

        System.out.println("\nКласс ArrayQueueModule:");
        ArrayQueueModule.create(5);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("Количество элементов в очереди: " + ArrayQueueModule.size()); // выводит 3
        System.out.println("Первый элемент: " + ArrayQueueModule.element()); // выводит 1
        System.out.println("Удаление и возвращение первого элемента: " + ArrayQueueModule.dequeue()); // выводит 1
        ArrayQueueModule.clear();
        System.out.println("Очередь пуста: " + ArrayQueueModule.isEmpty()); // выводит true
    }
}
