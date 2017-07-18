/**
 * Created by David Turk on 7/18/17.
 */
public class Main {
    public static void main(String[] args) {
        GamePiece rook = new GamePiece();
        rook.setColor("Black");
        rook.setName("Rook");
        rook.setGame("Chess-with-3-moves");

        System.out.println("The " + rook.getName() + " is " + rook.getColor() );
        System.out.println("The " + rook.getName() + " is playing " + rook.getGame() );

        rook.move(2,15);
        rook.freeze();
        System.out.println("The " + rook.getName() + " is at the following position...");
        System.out.println("Position x: " + rook.getPositionX() );
        System.out.println("Position y: " + rook.getPositionY() );
        if( rook.isFrozen() ){
            System.out.println("The " + rook.getName() + " is frozen");
        }

        System.out.println("Moving again");
        rook.move(1,8);
        System.out.println("The " + rook.getName() + " is at the following position...");
        System.out.println("Position x: " + rook.getPositionX() );
        System.out.println("Position y: " + rook.getPositionY() );

        System.out.println("Unfreezing");
        rook.unfreeze();
        if( ! rook.isFrozen() ){
            System.out.println("The " + rook.getName() + " is not frozen");
        }
    }
}
