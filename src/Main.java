import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece gp1 = new GamePiece();

        // move the piece and print the new position using getters
        gp1.move(10,10);
        System.out.println(gp1);

        // set the color and name of the piece
        gp1.setColor("red");
        gp1.setName("My Chess Piece");

        // freeze the piece and verify that it doesn't move
        if( gp1.freeze() ) {
            System.out.println("We froze the piece!");
        }
        gp1.move(20,20);
        System.out.println(gp1);

        // unfreeze the piece and verify
        if( !gp1.unfreeze() ) {
            System.out.println("We unfroze the piece!");
        }

        // verify we can move the piece again now that it isn't frozen
        gp1.move(20,20);
        System.out.println(gp1);


        // EXTRAS - use Random Ints to move the piece
        System.out.println("EXTRAS - random position ********** ");
        Random random1 = new Random();
        int newX = random1.nextInt(10);
        int newY = random1.nextInt(10);

        gp1.move(newX, newY);
        System.out.println(gp1);

        // MORE EXTRAS - set up board restrictions
        System.out.println("MORE EXTRAS - board restriction *******");
        GamePiece gp2 = new GamePiece(0,100,0,100);

        System.out.println(gp2);

        // attempt to move the piece outside max X boundary
        int oldX = gp2.getPositionX();
        gp2.moveWithBoundaries(101,80);
        if( gp2.getPositionX() != oldX ) {
            // something is wrong
            System.out.println("We shouldn't have moved!");
        } else {
            System.out.println("Max X boundary test passed!");
        }

        // attempt to move the piece outside min X boundary
        oldX = gp2.getPositionX();
        gp2.moveWithBoundaries(-1,80);
        if( gp2.getPositionX() != oldX ) {
            // something is wrong
            System.out.println("We shouldn't have moved!");
        } else {
            System.out.println("Min X boundary test passed!");
        }
        
        // attempt to move the piece outside Y boundary
        int oldY = gp2.getPositionY();
        gp2.moveWithBoundaries(50,101);
        if( gp2.getPositionY() != oldY ) {
            // something is wrong
            System.out.println("We shouldn't have moved!");
        } else {
            System.out.println("Max Y boundary test passed!");
        }

        // attempt to move the piece outside Y boundary
        oldY = gp2.getPositionY();
        gp2.moveWithBoundaries(50,-1);
        if( gp2.getPositionY() != oldY ) {
            // something is wrong
            System.out.println("We shouldn't have moved!");
        } else {
            System.out.println("Min Y boundary test passed!");
        }
    }
}
