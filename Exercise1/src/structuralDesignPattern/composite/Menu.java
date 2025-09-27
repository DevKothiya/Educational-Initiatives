package structuralDesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents;

    public Menu(String name) {
        super(name);
        menuComponents = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public List<MenuComponent> getChildren() {
        return menuComponents;
    }

    @Override
    public void display() {
        System.out.println("\n" + name);
        menuComponents.forEach(MenuComponent::display);
    }
}
