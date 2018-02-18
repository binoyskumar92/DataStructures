public class TTT {
    private char board[][];
    private char currentPlayerMark;

    public TTT() {
        board = new char[3][3];
        currentPlayerMark='O';
    }
    public char getCurrentPlayerMark(){
        return currentPlayerMark;
    }
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("");
            System.out.println("-------------");
        }


    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin() {
        return (checkRowForWin() || checkColForWin() || checkDiagonalsForWin());
    }

    public boolean checkRowForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkColForWin() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i])) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalsForWin() {
        return (checkRowCol(board[0][0], board[1][1], board[2][2]) || checkRowCol(board[2][0], board[1][1], board[0][1]));
    }

    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
    public void changePlayer(){
        if(currentPlayerMark=='O'){
            currentPlayerMark='X';
        }else{
            currentPlayerMark='O';
        }
    }
    public boolean placeMark(int row,int col){
        if(row>=0 && row<=3){
            if(col>=0 && col<=3){
                if(board[row][col]=='-'){
                    board[row][col]=currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }


}
