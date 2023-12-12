package Practice9;

class Cloth implements Priceable{
    protected String name;
    protected String price;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
    public String toString(){
        return "Товар: " + name + ", цена: " + price + " руб";
    }
}
