import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    TTT game = new TTT();
    Scanner sin=new Scanner(System.in);
        System.out.println(" Play the wonder ful game Tic-O-Tac-X-Toe ");
        game.initializeBoard();
        do{
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do{
                System.out.println("Player with "+game.getCurrentPlayerMark()+", enter an empty row and column to place mark ");
                row=sin.nextInt()-1;
                col=sin.nextInt()-1;
            }while(!game.placeMark(row,col));
            game.changePlayer();
        }while(!game.checkForWin());
        //find winner
        if(game.isBoardFull() && !game.checkForWin()){
            System.out.println("Tie game");
        }else{
            System.out.println("Current layout:");
            game.printBoard();
            game.changePlayer();
            System.out.println("WInner is:"+game.getCurrentPlayerMark());
        }
    }
}
