import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {

    @Test
    void testCalculateTotalPrice() {
        User user1 = new User(25, "John", "Doe");
        User user2 = new User(30, "Jane", "Smith");

        Laptop laptop = new Laptop("Dell", 1000, user1, true);
        Desktop desktop = new Desktop("HP", 800, user2, false);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(laptop);
        orderManager.addOrder(desktop);

        assertEquals(1800, orderManager.calculateTotalPrice());
    }

    @Test
    void testGetOrdersSortedByUserSurname() {
        User user1 = new User(25, "John", "Doe");
        User user2 = new User(30, "Jane", "Smith");

        Laptop laptop = new Laptop("Dell", 1000, user1, true);
        Desktop desktop = new Desktop("HP", 800, user2, false);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(laptop);
        orderManager.addOrder(desktop);

        List<Computer> sortedOrders = orderManager.getOrdersSortedByUserSurname();
        assertEquals("Doe", sortedOrders.get(0).getUser().getSurname());
        assertEquals("Smith", sortedOrders.get(1).getUser().getSurname());
    }
}