package mars;

import mars.directions.*;

public class Rover {
    private Position currentPosition;
    private Direction currentDirection;
    private final Plateau plateau;


    public Rover(int startX, int startY, String startDirection, Plateau plateau) {
        this.plateau = plateau;
        this.currentPosition = new Position(startX, startY);
        this.currentDirection = getDirection(startDirection);
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
    }

    public void turnRight() {
        currentDirection = this.currentDirection.turnRight();
    }

    public void move() {
        Position newPosition = currentDirection.moveForward(this.currentPosition);

        if (plateau.isSafe(newPosition)) {
            this.currentPosition = newPosition;
        } else {
            System.out.println("WARNING: Obstacle detected at " + newPosition.toString());
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public String getCurrentDirection() {
        return currentDirection.toString();
    }

    public String getStatus() {
        return "Currently, mars.Rover is at " + currentPosition.toString() + " facing " + currentDirection.toString();
    }
}
