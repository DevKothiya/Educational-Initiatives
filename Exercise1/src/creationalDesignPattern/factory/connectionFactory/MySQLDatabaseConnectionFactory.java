package creationalDesignPattern.factory.connectionFactory;

import creationalDesignPattern.factory.connection.DatabaseConnection;
import creationalDesignPattern.factory.connection.MySQLConnection;

public class MySQLDatabaseConnectionFactory implements DatabaseConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }
}
