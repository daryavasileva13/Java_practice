package Practice21.ex1.ex2;

// Интерфейс Queue:
// - enqueue(element) - добавить элемент в конец очереди
// - element() - получить первый элемент очереди без удаления
// - dequeue() - удалить и вернуть первый элемент очереди
// - size() - текущий размер очереди
// - isEmpty() - является ли очередь пустой
// - clear() - удалить все элементы из очереди

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void enqueue(E element) {
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }
    public E element() {
        return head.element;
    }
    public E dequeue() {
        E element = head.element;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
}
