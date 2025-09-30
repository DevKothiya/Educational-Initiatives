package mars.commands;

import mars.Rover;

public class LeftCommand implements Command {

    @Override
    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
