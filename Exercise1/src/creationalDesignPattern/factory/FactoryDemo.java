package creationalDesignPattern.factory;

import creationalDesignPattern.factory.connection.DatabaseConnection;
import creationalDesignPattern.factory.connectionFactory.DatabaseConnectionFactory;
import creationalDesignPattern.factory.connectionFactory.MongoDBConnectionFactory;
import creationalDesignPattern.factory.connectionFactory.MySQLDatabaseConnectionFactory;

import java.util.Scanner;

public class FactoryDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select Database to connect: 1) MySQL 2) MongoDB");
        int choice=scanner.nextInt();
        DatabaseConnectionFactory factory=null;
        DatabaseConnection connection;
        switch (choice){
            case 1:factory=new MySQLDatabaseConnectionFactory();
            break;
            case 2:factory=new MongoDBConnectionFactory();
            break;
            default:
                System.out.println("Invalid Choice");
        }

        if(factory!=null){
            connection=factory.createConnection();
            connection.connect();
            connection.disconnect();
        }

    }

}
