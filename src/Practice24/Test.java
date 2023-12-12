package Practice24;

public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new RestaurantOrder();
        orders[3].add(new Dish(200,"Блинчики", "Добавки: малиновый/клубничный/абрикосовый джем, мёд"));
        orders[4].add(new Drink(80,"Чай", "Черный/зеленый"));
        orders[2].add(new Drink(250, "Суп куриный", "Добавки: сметана, майонез"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[4], 6);
        orderManager.add(orders[3],2);
        orderManager.add("1", orders[3]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}