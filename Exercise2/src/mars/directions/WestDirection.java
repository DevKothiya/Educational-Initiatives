package mars.directions;

import mars.Position;

public class WestDirection implements Direction {

    private static final WestDirection INSTANCE = new WestDirection();

    private WestDirection() {
    }

    public static WestDirection getInstance() {
        return INSTANCE;
    }

    @Override
    public Direction turnLeft() {
        return SouthDirection.getInstance();
    }

    @Override
    public Direction turnRight() {
        return NorthDirection.getInstance();
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX() + 1, currentPosition.getY());
    }

    @Override
    public String toString(){
        return "W";
    }
}
