package day8;

public class AdvancedArray {
    public static void main(String[] args) {
        // A 3x3 grid representing a game of Tic-Tac-Toe
        char[][] ticTacToeBoard = {
                {'x', 'o', 'x'},
                {'o', 'x', 'o'},
                {' ', ' ', 'x'}
        };

        // Accessing data: array[row][column]
        // Let's grab the center element (row 1, column 1)ystem.out.println("First elemenet in first raw: " + ticTacToeBoard[0][0]); // Output: x
        System.out.println("Center element: " + ticTacToeBoard[1][1]); // Output: x
        System.out.println("last element in last raw: " + ticTacToeBoard[2][2]); // Output: x
        System.out.println("empty element in last raw: " + ticTacToeBoard[2][1]); // Output: ' '
    }
}