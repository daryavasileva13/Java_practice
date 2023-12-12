package Practice6;

public class Pydel extends Dog {
    public Pydel(String name){
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("Пудель по кличке " + getName());
    }
}
