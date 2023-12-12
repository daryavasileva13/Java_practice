package Practice6;

public abstract class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void printName();
}
