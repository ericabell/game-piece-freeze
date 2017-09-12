public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece gp1 = new GamePiece();

        // move the piece and print the new position using getters
        gp1.move(10,10);
        System.out.println(gp1.getPositionX() + ", " + gp1.getPositionY());

        // set the color and name of the piece
        gp1.setColor("red");
        gp1.setName("My Chess Piece");

        // freeze the piece and verify that it doesn't move
        gp1.freeze();
        if( gp1.frozen ) {
            System.out.println("We froze the piece!");
        }
        gp1.move(20,20);
        System.out.println(gp1.getPositionX() + ", " + gp1.getPositionY());

    }
}
