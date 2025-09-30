package mars.commands;

import mars.Rover;

public class RightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
