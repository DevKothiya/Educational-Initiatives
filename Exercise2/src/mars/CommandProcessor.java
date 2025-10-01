package mars;

import mars.commands.Command;
import mars.commands.LeftCommand;
import mars.commands.MoveCommand;
import mars.commands.RightCommand;

public class CommandProcessor {
    private final Logger logger;

    public CommandProcessor() {
        this.logger = new Logger();
    }

    public Command getCommand(char instruction) {
        return switch (instruction) {
            case 'M' -> new MoveCommand();
            case 'L' -> new LeftCommand();
            case 'R' -> new RightCommand();
            default -> throw new IllegalArgumentException("Unknown command instruction: " + instruction);
        };

    }

    public void processCommands(Rover rover, String commands) {
        logger.info("Processing commands");
        for (char instruction : commands.toCharArray()) {
            try {
                Command command = getCommand(instruction);
                command.execute(rover);
            } catch (IllegalArgumentException exception) {
                logger.error("Error processing command " + instruction, exception);
            } catch (Exception exception) {
                logger.error("An error occured during command execution", exception);
            }

        }
    }
}
