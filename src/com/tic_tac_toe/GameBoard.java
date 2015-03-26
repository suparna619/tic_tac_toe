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


    public void printBoard(int x, int y, String playerSymbol){
        if (x>numOfRow-1 || y>numOfColumn-1) {
            System.out.println("Wrong position");
            System.exit(1);
        }


        board[x][y] = playerSymbol;
        for (int i = 0; i < numOfColumn; i++){
            for (int j = 0; j < numOfRow; j++){
                if(board[i][j] != null)
                    System.out.print("  "+board[i][j]+"  ");
                else System.out.print("  -  ");
            }
            System.out.println("\n");
        }

    }

}
