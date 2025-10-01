package mars;

import java.util.Collections;
import java.util.Set;

public class Plateau {

    private final int length;
    private final int width;
    private final Logger logger;

    private final Set<Position> obstacles;

    public Plateau(int length, int width, Set<Position> obstacles) {
        this.length = length;
        this.width = width;
        this.logger = new Logger();
        this.obstacles = Collections.unmodifiableSet(obstacles);
        logger.info("Plateau initialized with size of " + length + "x" + width + " and obstacles at " + getObstacles());
    }

    public boolean isSafe(Position position) {
        if (!isWithinBounds(position)) {
            logger.warn("Rover moved out of bounds at " + position);
            return false;
        }
        if (isObstacle(position)) {
            logger.warn("Obstacle detected at " + position);
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
