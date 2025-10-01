package mars;

import java.util.HashSet;
import java.util.Set;

public class RoverSimulator {
    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        Set<Position> obstacles = new HashSet<>();
        obstacles.add(new Position(2, 2));
        obstacles.add(new Position(3, 5));
        Plateau plateau = new Plateau(length, width, obstacles);

        Rover rover = new Rover(0, 0, "N", plateau);
        String commands = "MMRMMLMD";
        CommandProcessor commandProcessor = new CommandProcessor();
        commandProcessor.processCommands(rover, commands);

        rover.getStatus();
    }
}
