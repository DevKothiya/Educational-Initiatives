package mars;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final DateTimeFormatter formator=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private String formatMessage(String level, String message){
        return String.format("[%s] [%s] %s", LocalDateTime.now().format(formator),level,message);
    }
    public void info(String message){
        System.out.println(formatMessage("INFO",message));
    }

    public void warn(String message){
        System.out.println(formatMessage("WARN",message));
    }

    public void error(String message){
        System.out.println(formatMessage("ERROR",message));
    }

    public void error(String message, Throwable t){
        this.error(message);
        t.printStackTrace(System.err);
    }
}
