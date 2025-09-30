package mars.commands;

import mars.Rover;

public interface Command {
    void execute(Rover rover);
}
