package creationalDesignPattern.factory.connection;

public class MongoDBConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("MongoDB Database is now connected");
    }

    @Override
    public void disconnect() {
        System.out.println("MongoDB Database is now disconnected");
    }
}
