package mars.directions;

import mars.Position;

public class NorthDirection implements Direction {

    private static final NorthDirection INSTANCE = new NorthDirection();

    private NorthDirection() {
    }

    public static NorthDirection getInstance() {
        return INSTANCE;
    }

    @Override
    public Direction turnLeft() {
        return WestDirection.getInstance();
    }

    @Override
    public Direction turnRight() {
        return EastDirection.getInstance();
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() + 1);
    }

    @Override
    public String toString(){
        return "N";
    }
}
