package Practice6;

public class FurnitureShop {
    public static void main(String[] args){
        System.out.println("Магазин: _СУПЕР_МЕБЕЛЬ_" + "\n" + "Каталог товаров:" + "\n");
        Table table = new Table("Дерево - дуб", 2000, 2);
        table.printInfo();
        Chair chair = new Chair("Дерево - дуб", 1500, 10);
        chair.printInfo();
    }
}
