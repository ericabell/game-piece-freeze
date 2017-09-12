public class Main {

    public static void main(String[] args) {
	// write your code here
        GamePiece gp1 = new GamePiece();

        gp1.move(10,10);
        System.out.println(gp1.getPositionX() + ", " + gp1.getPositionY());
    }
}
