/**
 * Created by David Turk on 7/18/17.
 */
public class Main {
    public static void main(String[] args) {
        GamePiece rook = new GamePiece();

        rook.setColor("Black");
        if( rook.getColor() != "Black"){
            System.out.println("The color is not black");
            throw new AssertionError();
        }

        rook.setColor("White");
        if(rook.getColor() != "White"){
            System.out.println("The color is not white");
            throw new AssertionError();
        }

        rook.setName("Rook");
        if(rook.getName() != "Rook"){
            System.out.println("The name is not rook");
            throw new AssertionError();
        }

        rook.setName("Tower");
        if(rook.getName() != "Tower"){
            System.out.println("The name is not tower");
            throw new AssertionError();
        }

        rook.setGame("Chess-with-3-moves");
        if(rook.getGame() != "Chess-with-3-moves"){
            System.out.println("Game is not Chess-with-3-moves");
            throw new AssertionError();
        }

        rook.setGame("Real Chess");
        if(rook.getGame() != "Real Chess"){
            System.out.println("The game is not Real Chess");
            throw new AssertionError();
        }

        rook.move(2,15);
        if(rook.getPositionX() != 2 || rook.getPositionY() != 15){
            System.out.println("The rook is not at the right position (2, 15)");
            throw new AssertionError();
        }
        rook.freeze();
        if( ! rook.isFrozen() ){
            System.out.println("The rook is not frozen");
            throw new AssertionError();
        }

        rook.move(1,8);
        if(rook.getPositionX() != 2 || rook.getPositionY() != 15){
            System.out.println("The rook is not at the right position (2, 15)");
            throw new AssertionError();
        }

        rook.unfreeze();
        if(rook.isFrozen()){
            System.out.println("The rook is not supposed to be frozen");
            throw new AssertionError();
        }

        System.out.println("All tests pass!");
    }
}
