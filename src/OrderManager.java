import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderManager {
    private List<Computer> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Computer computer) {
        orders.add(computer);
    }

    public double calculateTotalPrice() {
        return orders.stream().mapToDouble(Computer::getPrice).sum();
    }

    public List<Computer> getOrdersSortedByUserSurname() {
        List<Computer> sortedOrders = new ArrayList<>(orders);
        sortedOrders.sort(Comparator.comparing(computer -> computer.getUser().getSurname()));
        return sortedOrders;
    }
}
