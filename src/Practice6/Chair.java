package Practice6;

public class Chair extends Furniture {
    private int data;
    public Chair(String material, double price, int data){
        super(material, price);
        this.data = data;
    }

    public void printInfo(){
        System.out.println("Стол: материал: " + getMaterial() +  "\n" + "Цена: " + getPrice() + "\n" + "В наличии: " + data + " шт");
    }
}
