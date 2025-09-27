package structuralDesignPattern.composite;

public class MenuItem extends MenuComponent {
    private final double price;

    public MenuItem(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println(name + " : ₹" + price);
    }
}
