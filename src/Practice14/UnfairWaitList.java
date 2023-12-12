package Practice14;

import java.util.Iterator;

public class UnfairWaitList <E> extends WaitList{
    UnfairWaitList(){
        super();
    }
    public Object remove(E element) {
        return this.content.remove(element);
    }
    public void moveToBack(E element){
        this.content.remove(element);
        this.content.add(element);
    }
}
