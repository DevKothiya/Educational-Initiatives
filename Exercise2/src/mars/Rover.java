package mars;

import mars.directions.*;

public class Rover {
    private Position currentPosition;
    private Direction currentDirection;
    private final Plateau plateau;
    private final Logger logger;


    public Rover(int startX, int startY, String startDirection, Plateau plateau) {
        this.plateau = plateau;
        this.currentPosition = new Position(startX, startY);
        this.currentDirection = getDirection(startDirection);
        this.logger = new Logger();
        logger.info("Rover starting at "+currentPosition.toString());
    }

    private Direction getDirection(String dir) {
        return switch (dir.toUpperCase()) {
            case "N" -> NorthDirection.getInstance();
            case "E" -> EastDirection.getInstance();
            case "W" -> WestDirection.getInstance();
            case "S" -> SouthDirection.getInstance();
            default -> {
                System.err.println("Invalid Direction. Defaulting to North Direction");
                yield NorthDirection.getInstance();
            }
        };
    }

    public void turnLeft() {
        currentDirection = this.currentDirection.turnLeft();
        logger.info("Turned left. New direction:"+currentDirection);
    }

    public void turnRight() {
        currentDirection = this.currentDirection.turnRight();
        logger.info("Turned right. New direction:"+currentDirection);
    }

    public void move() {
        Position newPosition = currentDirection.moveForward(this.currentPosition);

        if (plateau.isSafe(newPosition)) {
            this.currentPosition = newPosition;
            logger.info("Moved to "+currentPosition);
        } else {
            logger.warn("Rover stopped at "+currentPosition);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public String getCurrentDirection() {
        return currentDirection.toString();
    }

    public void getStatus() {
        logger.info("Currently, Rover is at " + currentPosition.toString() + " facing " + currentDirection.toString());
    }
}
