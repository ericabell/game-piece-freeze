public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;

    String name;
    String color;

    int minX;
    int maxX;
    int minY;
    int maxY;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public GamePiece(int minX, int maxX, int minY, int maxY) {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;

        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int newX, int newY) {
        if( this.frozen ) {
            // can't move if we're frozen!
        } else {
            this.positionX = newX;
            this.positionY = newY;
        }
    }

    public void moveWithBoundaries( int newX, int newY ) {
        if( this.frozen ) {
            // can't move if we're frozen!
        } else {
            // check to see that our destination is within the board
            if( minX <= newX  && newX <= maxX ) {
                // ok to move in X
                this.positionX = newX;
            }
            if( minY <= newY && newY <= maxY ) {
                // ok to move in Y
                this.positionY = newY;
            }
        }
    }

    public boolean freeze() {
        this.frozen = true;
        return( this.frozen );
    }

    public boolean unfreeze() {
        this.frozen = false;
        return( this.frozen );
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", frozen=" + frozen +
                '}';
    }
}
