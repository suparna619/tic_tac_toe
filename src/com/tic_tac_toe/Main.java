package com.tic_tac_toe;

public class Main {

    public static void main(String[] args) {
        int chance = 1;
        GameBoard gameBoard = new GameBoard();

        while (chance<10){
            Position position = new Position();
            String positionValue = position.askPosition();
            String[] X_Y_values = positionValue.split(" ");
            int x = Integer.parseInt(X_Y_values[0]);
            int y = Integer.parseInt(X_Y_values[1]);
            if(chance%2 != 0){
                System.out.println("Chance for Player 1");
                gameBoard.printBoard(x, y, "X", "Player 1");
            }
            else{
                System.out.println("Chance for Player 2");
                gameBoard.printBoard(x, y, "O", "Player 2");
            }
            chance++;
        }
    }
}
