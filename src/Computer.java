import java.util.Objects;

public abstract class Computer implements Discountable {
    protected String brand;
    protected double price;
    protected User user;

    public Computer(String brand, double price, User user) {
        this.brand = brand;
        this.price = price;
        this.user = user;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.price, price) == 0 &&
                Objects.equals(brand, computer.brand) &&
                Objects.equals(user, computer.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, user);
    }
}