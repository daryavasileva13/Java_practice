package Practice9;

public class TestPriceable {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Молоко");
        product1.setPrice("50");
        System.out.println(product1);

        Cloth cloth1 = new Cloth();
        cloth1.setName("Футболка");
        cloth1.setPrice("1000");
        System.out.println(cloth1);
    }
}