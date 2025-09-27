package structuralDesignPattern.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        MenuItem pizza = new MenuItem("Pizza", 349);
        MenuItem pasta = new MenuItem("Pasta", 249);

        Menu italianMenu = new Menu("Italian Menu");
        italianMenu.add(pizza);
        italianMenu.add(pasta);

        MenuItem dosa = new MenuItem("Dosa", 279);
        Menu southIndianMenu = new Menu("South Indian Menu");
        southIndianMenu.add(dosa);

        MenuItem alooParatha = new MenuItem("Pav Bhaji", 199);
        Menu northIndianMenu = new Menu("North Indian Menu");
        northIndianMenu.add(alooParatha);

        Menu indianMenu = new Menu("Indian Menu");
        indianMenu.add(southIndianMenu);
        indianMenu.add(northIndianMenu);

        Menu mainMenu = new Menu("Main Menu");
        mainMenu.add(italianMenu);
        mainMenu.add(indianMenu);

        mainMenu.display();

    }
}
