package Practice21.ex1;


public class ArrayQueue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.capacity = capacity;
    }
    public void enqueue(int element) {
        elements[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }
    public int element() {
        return elements[front];
    }
    public int dequeue() {
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }
}