package Practice14;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList{
    /**
     * A using container
     */
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Initialising container
     */
    public WaitList(){
        this.content=new ConcurrentLinkedQueue<E>();
    };

    /**
     * Initialising container which based on different collection
     * @param c is different collection which used
     *          to initialising container
     */
    public WaitList(Collection<E> c){
        this.content=new ConcurrentLinkedQueue<E>(c);
    };

    /**
     * Output contain of container
     * @return class of object and its memory address
     */
    @Override
    public String toString() {
        for (Iterator itr=this.content.iterator();itr.hasNext();){
            System.out.print(itr.next());
            System.out.print(" ");
        }
        return super.toString();
    }

    /**
     * Adding element in the end of container
     * @param element is element which need to insert
     */
    @Override
    public void add(Object element) {
        this.content.add((E)element);
    }

    /**
     * Delete the first element of container
     * @return removing value
     */
    @Override
    public Object remove() {
        return this.content.remove();
    }

    /**
     * Check that element in container
     * @param element value that need to find
     * @return true - element in container
     *         false - element not in container
     */
    @Override
    public boolean contains(Object element) {
        return this.content.contains(element);
    }

    /**
     *Check that collection in container
     * @param c collection that need to find
     * @return true - collection in container
     *         false - collection not in container
     */
    @Override
    public boolean containsAll(Collection c) {
        return this.content.containsAll(c);
    }

    /**
     * Check that container contains at least one element
     * @return true - length of container !=0
     *         false - length of container = 0
     */
    @Override
    public boolean isEmpty() {
        return this.content.isEmpty();
    }
}
