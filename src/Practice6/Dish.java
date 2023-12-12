package Practice6;

public abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color){
        this.color = color;
        this.material = material;
    }

    public void  setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public abstract void printInfo();

}




