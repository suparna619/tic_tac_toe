package com.tic_tac_toe;

public class Main {

    public static void main(String[] args) {
        int x, y, chance = 1;
        GameBoard gameBoard = new GameBoard();

        while (chance<10){
            FindPosition findPosition = new FindPosition().invoke();
            x = findPosition.getX();
            y = findPosition.getY();
            if(chance == 9){
                System.out.println("Game Draw - Run the app to play again");
                System.exit(1);
            }
            if(chance%2 != 0){
                System.out.println("Chance for Player 1");
                gameBoard.playTicTacToe(x, y, "X", "Player 1");
            }
            else{
                System.out.println("Chance for Player 2");
                gameBoard.playTicTacToe(x, y, "O", "Player 2");
            }
            chance++;
        }
    }

    public static class FindPosition {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public FindPosition invoke() {
            askPosition askPosition = new askPosition();
            String positionValue = askPosition.askPosition();
            String[] X_Y_values = positionValue.split(" ");
            x = Integer.parseInt(X_Y_values[0]);
            y = Integer.parseInt(X_Y_values[1]);
            return this;
        }
    }
}
