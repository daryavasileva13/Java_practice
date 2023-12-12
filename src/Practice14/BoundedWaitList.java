package Practice14;

public class BoundedWaitList <E> extends WaitList {

    private int capacity;

    BoundedWaitList(int capacity){
        super();
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (this.content.size()<capacity){
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
