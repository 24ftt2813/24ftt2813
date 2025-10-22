import java.util.Random;
import java.util.Scanner;
public class TicTacToeWithComputer {

    // The game board
    private static char[][] board = new char[3][3];
    // Scanner for player input
    private static Scanner scanner = new Scanner(System.in);
    // Random for computer moves
    private static Random random = new Random();

    public static void main(String[] args) {
        initializeBoard(); // Set up the empty board
        printBoard();      // Display the initial empty board

        boolean gameOver = false;
        char currentPlayer = 'X'; // Player is 'X', Computer is 'O'

        while (!gameOver) {
            if (currentPlayer == 'X') {
                // Player's turn
                System.out.println("Player's turn");
                playerMove();
            } else {
                // Computer's turn
                System.out.println("Computer's turn");
                computerMove();
            }

            printBoard(); // Display the board after each move

            if (checkWin(currentPlayer)) {
                System.out.println("Game ended, " + (currentPlayer == 'X' ? "Player" : "Computer") + " win");
                gameOver = true;
            } else if (isBoardFull()) {
                System.out.println("Game ended, It's a draw!");
                gameOver = true;
            }

            // Switch turns
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close(); // Close the scanner when the game ends
    }

    /**
     * Initializes the 3x3 game board with empty spaces.
     */
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // ' ' represents an empty cell
            }
        }
    }

    /**
     * Prints the current state of the game board to the console.
     */
    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | "); // Separator between columns
                }
            }
            System.out.println(); // New line after each row
            if (i < 2) {
                System.out.println("---------"); // Separator between rows
            }
        }
    }

    /**
     * Handles the human player's move. Prompts for row and column,
     * validates input, and places 'X' on the board.
     */
    private static void playerMove() {
        int row, col;
        while (true) {
            System.out.print("Enter a row (0,1 or 2): ");
            row = getUserInput();
            System.out.print("Enter a column (0,1 or 2): ");
            col = getUserInput();

            if (isValidMove(row, col)) {
                board[row][col] = 'X';
                break; // Valid move, exit loop
            } else {
                System.out.println("This spot is already taken or invalid. Try again.");
            }
        }
    }

    /**
     * Helper method to get and validate integer input from the user.
     * Ensures the input is between 0 and 2.
     */
    private static int getUserInput() {
        int input = -1;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= 0 && input <= 2) {
                    return input;
                } else {
                    System.out.print("Invalid input. Please enter 0, 1, or 2: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number (0, 1, or 2): ");
            }
        }
    }

    /**
     * Handles the computer's move. Randomly selects a row and column
     * until an empty spot is found, then places 'O' on the board.
     */
    private static void computerMove() {
        int row, col;
        while (true) {
            row = random.nextInt(3); // Generates 0, 1, or 2
            col = random.nextInt(3); // Generates 0, 1, or 2

            if (isValidMove(row, col)) {
                System.out.println("Computer chose row " + row + ", column " + col);
                board[row][col] = 'O';
                break; // Valid move, exit loop
            }
        }
    }

    /**
     * Checks if a given row and column constitute a valid move (i.e.,
     * within bounds and the cell is empty).
     *
     * @param row The row index.
     * @param col The column index.
     * @return true if the move is valid, false otherwise.
     */
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    /**
     * Checks if the current player has won the game.
     *
     * @param player The character ('X' or 'O') of the player to check.
     * @return true if the player has won, false otherwise.
     */
    private static boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false; // No win found
    }

    /**
     * Checks if the game board is completely full (no empty spaces).
     *
     * @return true if the board is full, false otherwise.
     */
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Found an empty spot, board is not full
                }
            }
        }
        return true; // No empty spots found, board is full
    }
}

