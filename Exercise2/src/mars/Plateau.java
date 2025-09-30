package mars;

import java.util.HashSet;
import java.util.Set;

public class Plateau {

    private final int length;
    private final int width;

    private final Set<Position> obstacles;

    public Plateau(int length, int width, Set<Position> obstacles) {
        this.length = length;
        this.width = width;
        this.obstacles = new HashSet<>();
    }

    public boolean isSafe(Position position) {
        if (!isWithinBounds(position)) {
            System.err.println("WARNING: Rover is out of bound." );
            return false;
        }
        if (isObstacle(position)) {
            System.err.println("WARNING: Obstacle detected at "+position);
            return false;
        }
        return true;
    }

    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < length && position.getY() >= 0 && position.getY() < width;
    }

    public Set<Position> getObstacles() {
        return obstacles;
    }
}
