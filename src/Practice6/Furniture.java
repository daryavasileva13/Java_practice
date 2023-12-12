package Practice6;

public abstract class Furniture {
    private String material;
    private double price;


    public Furniture(String material, double price){
        this.price = price;
        this.material = material;
    }

    public void  setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public abstract void printInfo();

}
