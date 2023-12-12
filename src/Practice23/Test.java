package Practice23;

public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        orders[3].add(new Dish(200,"Блинчики", "Добавки: малиновый/клубничный/абрикосовый джем, мёд"));
        orders[3].add(new Dish(80,"Чай", "Черный/зеленый"));
        orders[1].add(new Dish(250, "Суп куриный", "Добавки: сметана, майонез"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[5], 5);
        orderManager.removeOrder(5);
        orderManager.add(orders[1],3);
        System.out.println("Сумма заказов: ");
        System.out.println(orderManager.ordersCostSummary());
        System.out.println("Свободные столики: ");
        System.out.println(orderManager.freeTableNumbers());
        System.out.println("Количество свободных столиков: ");
        System.out.println(orderManager.freeTableNumber());
    }
}
