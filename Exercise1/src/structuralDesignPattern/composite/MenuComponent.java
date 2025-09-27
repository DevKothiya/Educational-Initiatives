package structuralDesignPattern.composite;

import java.util.List;

public abstract class MenuComponent {

    protected final String name;

    public MenuComponent(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public List<MenuComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public abstract void display();


}
