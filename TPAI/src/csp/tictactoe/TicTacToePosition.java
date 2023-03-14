package csp.tictactoe;

public class TicTacToePosition extends Position {
    final static public int BLANK = 0;
    final static public int HUMAN = 1;
    final static public int PROGRAM = -1;
    int [] board = new int[9];
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        int i;
        for ( i=0; i<8; i++) {
            sb.append(""+board[i]+",");
        }
        sb.append(""+board[i]+"]");
        return sb.toString();
    }
}
