package mars.directions;

import mars.Position;

public interface Direction {

    Direction turnLeft();

    Direction turnRight();

    Position moveForward(Position currentPosition);

    String toString();
}
