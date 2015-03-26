package com.tic_tac_toe;

/**
 * Created by suparnad on 3/26/2015.
 */
public class GameBoard {
    private int numOfRow = 3;
    private int numOfColumn = 3;
    private String[][] board = new String[numOfColumn][numOfRow];
    private int row = 0;
    private int column = 0;


    public void printBoard(int x, int y, String playerSymbol, String playerName){
        if (x>numOfRow-1 || y>numOfColumn-1) {
            System.out.println("Wrong position");
            System.exit(1);
        }

        board[x][y] = playerSymbol;
        if(checkConditionToWin(playerSymbol)){
            System.out.println("***Congratulation "+playerName+" wines***");
            System.exit(1);
        }
        for (int i = 0; i < numOfColumn; i++){
            for (int j = 0; j < numOfRow; j++){
                if(board[i][j] != null)
                    System.out.print("  "+board[i][j]+"  ");
                else System.out.print("  -  ");
            }
            System.out.println("\n");
        }

    }

    private boolean checkConditionToWin(String playerSymbol) {
        if(checkForRow(playerSymbol)
                || checkForColumn(playerSymbol) || checkForDiagonal(playerSymbol))
            return true;
        else return false;
    }

    private boolean checkForDiagonal(String playerSymbol) {
        if ((board[0][0]==playerSymbol && board[1][1]==playerSymbol && board[2][2]==playerSymbol) ||
                (board[0][2]==playerSymbol && board[1][1]==playerSymbol && board[2][0]==playerSymbol))
            return true;
        else return false;
    }

    private boolean checkForColumn(String playerSymbol) {
        if ((board[0][0]==playerSymbol && board[1][0]==playerSymbol && board[2][0]==playerSymbol) ||
                (board[0][1]==playerSymbol && board[1][1]==playerSymbol && board[2][1]==playerSymbol) ||
                (board[0][2]==playerSymbol && board[1][2]==playerSymbol && board[2][2]==playerSymbol))
            return true;
        else return false;
    }

    private boolean checkForRow(String playerSymbol) {
        if ((board[0][0]==playerSymbol && board[0][1]==playerSymbol && board[0][2]==playerSymbol) ||
                (board[1][0]==playerSymbol && board[1][1]==playerSymbol && board[1][2]==playerSymbol) ||
                (board[2][0]==playerSymbol && board[2][1]==playerSymbol && board[2][2]==playerSymbol))
            return true;
        else return false;
    }

}
