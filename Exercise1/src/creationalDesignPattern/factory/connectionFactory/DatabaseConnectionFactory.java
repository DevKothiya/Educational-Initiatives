package creationalDesignPattern.factory.connectionFactory;

import creationalDesignPattern.factory.connection.DatabaseConnection;

public interface DatabaseConnectionFactory {
    DatabaseConnection createConnection();
}
