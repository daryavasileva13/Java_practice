package Practice21.ex1;

public class ArrayQueueADT {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public static void create(ArrayQueueADT queue, int capacity) {
        queue.elements = new int[capacity];
        queue.front = 0;
        queue.rear = 0;
        queue.size = 0;
        queue.capacity = capacity;
    }
    public static void enqueue(ArrayQueueADT queue, int element) {
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.capacity;
        queue.size++;
    }
    public static int element(ArrayQueueADT queue) {
        return queue.elements[queue.front];
    }
    public static int dequeue(ArrayQueueADT queue) {
        int element = queue.elements[queue.front];
        queue.front = (queue.front + 1) % queue.capacity;
        queue.size--;
        return element;
    }
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    public static void clear(ArrayQueueADT queue) {
        queue.front = 0;
        queue.rear = 0;
        queue.size = 0;
    }
}