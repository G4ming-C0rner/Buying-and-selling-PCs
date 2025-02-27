public class Laptop extends Computer {
    private boolean isGaming;

    public Laptop(String brand, double price, User user, boolean isGaming) {
        super(brand, price, user);
        this.isGaming = isGaming;
    }

    @Override
    public double calculateDiscount() {
        return isGaming ? price * 0.1 : price * 0.05;
    }
}

public class Desktop extends Computer {
    private boolean isUpgradable;

    public Desktop(String brand, double price, User user, boolean isUpgradable) {
        super(brand, price, user);
        this.isUpgradable = isUpgradable;
    }

    @Override
    public double calculateDiscount() {
        return isUpgradable ? price * 0.15 : price * 0.07;
    }
}