package Practice18;

import java.io.Serializable;

public class Tvk<T extends String & Comparable<String>, V extends Animal & Serializable, K> {
    T t;
    V v;
    K k;
    Tvk(T t,V v,K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return t.getClass() + " " + v.getClass() + " " + k.getClass();
    }

    public void printClassNames() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }

    public static void main(String[] args) {
        String str = "Hello";
        Animal animal = new Animal();
        Integer integer = 5;

        Tvk<String, Animal, Integer> parameters = new Tvk<>(str, animal, integer);
        parameters.printClassNames();
    }
}



