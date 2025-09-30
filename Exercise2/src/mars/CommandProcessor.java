package mars;

import mars.commands.Command;
import mars.commands.LeftCommand;
import mars.commands.MoveCommand;
import mars.commands.RightCommand;

public class CommandProcessor {

    public Command getCommand(char instruction){
        return switch (instruction) {
            case 'M' -> new MoveCommand();
            case 'L' -> new LeftCommand();
            case 'R' -> new RightCommand();
            default -> throw new IllegalArgumentException("Unknown command instruction: " + instruction);
        };

    }

    public void processCommands(Rover rover, String commands){
        System.out.println("Processing commands");
        for(char instruction: commands.toCharArray()){
            try{
                Command command=getCommand(instruction);
                command.execute(rover);
            }catch (IllegalArgumentException exception){
                System.err.println("Error processing command:"+instruction+" : "+ exception.getMessage());
            }
        }
    }
}
