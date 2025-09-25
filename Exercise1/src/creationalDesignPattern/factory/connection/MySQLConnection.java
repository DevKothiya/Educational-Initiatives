package creationalDesignPattern.factory.connection;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("MySQL Database is now connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL Database is now disconnected");
    }
}
