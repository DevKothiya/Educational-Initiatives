package creationalDesignPattern.singleton;

public class ConfigDemo {

    public static void main(String[] args) {

        ConfigManager configManager1 = ConfigManager.getInstance();

        String dbUrl = configManager1.getProperty("spring.datasource.url", "jdbc:mysql://localhost:3306/default");
        String mailHost = configManager1.getProperty("spring.mail.host", "smtp.mail.com");
        String mailPort = configManager1.getProperty("spring.mail.port", "587");

        System.out.println("Database url:" + dbUrl);
        System.out.println("Mail Host:" + mailHost);
        System.out.println("Mail Port:" + mailPort);

        ConfigManager configManager2 = ConfigManager.getInstance();
        System.out.println("Is Singleton:" + (configManager1 == configManager2));

    }

}
