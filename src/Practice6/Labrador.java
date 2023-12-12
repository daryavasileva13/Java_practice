package Practice6;

public class Labrador extends Dog {
    public Labrador(String name){
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("Лабрадор по кличке " + getName());
    }
}
