package Practice21.ex1;

public class ArrayQueueModule {
    private static int[] elements;
    private static int front;
    private static int rear;
    private static int size;
    private static int capacity;

    public static void create(int capacity) {
        elements = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
        ArrayQueueModule.capacity = capacity;
    }

    public static void enqueue(int element) {
        elements[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }

    public static int element() {
        return elements[front];
    }

    public static int dequeue() {
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }
}
