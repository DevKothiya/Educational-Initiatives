package creationalDesignPattern.factory.connectionFactory;

import creationalDesignPattern.factory.connection.DatabaseConnection;
import creationalDesignPattern.factory.connection.MongoDBConnection;

public class MongoDBConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MongoDBConnection();
    }
}
