package flyweight.flyweight2;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(String flavour, int tableNumber) {
        orders.add(Order.of(flavour, tableNumber));
    }

    public void service() {
        orders.forEach(Order::serve);
    }

}
