package mars;

public class Position {

    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass()!=Position.class) return false;
        Position position = (Position) o;
        return x == position.getX() && y == position.getY();
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
