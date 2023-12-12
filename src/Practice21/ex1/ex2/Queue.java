package Practice21.ex1.ex2;

public interface Queue<E> {
    void enqueue(E element);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}