package mars.directions;

import mars.Position;

public class EastDirection implements Direction {

    private static final EastDirection INSTANCE = new EastDirection();

    private EastDirection() {
    }

    public static EastDirection getInstance() {
        return INSTANCE;
    }

    @Override
    public Direction turnLeft() {
        return NorthDirection.getInstance();
    }

    @Override
    public Direction turnRight() {
        return SouthDirection.getInstance();
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX() + 1, currentPosition.getY());
    }

    @Override
    public String toString(){
        return "E";
    }
}
