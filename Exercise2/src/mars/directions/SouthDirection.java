package mars.directions;

import mars.Position;

public class SouthDirection implements Direction {

    private static final SouthDirection INSTANCE = new SouthDirection();

    private SouthDirection() {
    }

    public static SouthDirection getInstance() {
        return INSTANCE;
    }

    @Override
    public Direction turnLeft() {
        return EastDirection.getInstance();
    }

    @Override
    public Direction turnRight() {
        return WestDirection.getInstance();
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() - 1);
    }

    @Override
    public String toString(){
        return "S";
    }
}
