package Practice6;

public class Cup extends Dish{
    public Cup(String material, String color){
        super(material, color);
    }

    public void printInfo(){
        System.out.println("Кружка: материал – " + getMaterial() + "; цвет – " + getColor());
    }
}
