package Practice6;

public class Plate extends Dish{
    public Plate(String material, String color){
        super(material, color);
    }
    public void printInfo(){
        System.out.println("Тарелка: материал – " + getMaterial() + "; цвет – " + getColor());
    }
}
