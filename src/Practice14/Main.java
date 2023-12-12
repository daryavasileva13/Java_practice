package Practice14;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        BoundedWaitList <Integer> bq = new BoundedWaitList<Integer>(2);
        bq.add(4);
        bq.add(5);
        System.out.println(bq);
        bq.add(6);
        System.out.println(bq);
        System.out.println(bq.getCapacity());
        bq.remove();
        System.out.println(bq);

        System.out.println();

        UnfairWaitList <Double> uq = new UnfairWaitList<>();
        uq.add(4);
        uq.add(5);
        uq.add(6);
        System.out.println(uq);
        uq.moveToBack(5.0);
        System.out.println(uq);
        uq.remove(6.0);
        System.out.println(uq);
        uq.remove(7.0);
        System.out.println(uq);
        uq.remove();
        System.out.println(uq);
    }
}
