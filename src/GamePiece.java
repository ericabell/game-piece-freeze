public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;

    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
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

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }
}
