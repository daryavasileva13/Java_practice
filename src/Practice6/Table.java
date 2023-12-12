package Practice6;

public class Table extends Furniture {
    private int data;
    public Table(String material, double price, int data){
        super(material, price);
        this.data = data;
    }

    public void printInfo(){
        System.out.println("Стол: материал: " + getMaterial() +  "\n" + "Цена: " + getPrice() + "\n" + "В наличии: " + data + " шт" + "\n" );
    }
}
