/* 
 * Tic Tac Toe game
 */

/* As you read this code, you will see 'Pre:' and 'Post:'.  'Pre:'
 * refers to the pre-conditions and 'Post:' post-conditions.
 * Pre-conditions are the conditions that should hold before
 * the method is executed, whereas post-conditions are the conditions
 * that should hold after the method has been executed.
 *
 *
 *
 * A board is a 3x3 grid, which you can picture mentally as follows.
 * The squares of the grid are numbered 1 through 9, as indicated below.
 *
 *    |   |
 *  1 | 2 | 3
 *    |   |
 * ---+---+---
 *    |   |
 *  4 | 5 | 6
 *    |   |
 * ---+---+---
 *    |   |
 *  7 | 8 | 9
 *    |   |
 *
 * Each square can be empty, can be occupied by an X, or
 * can be occupied by an O.
 */

public class Ttt {

    // The number of empty spaces in the board.
    private static int spacesLeft;

    // If square i of the board is empty, variable si = ' '.
    // If square i of the board contains an X, variable si = 'X'.
    // If square i of the board contains an O, variable si = 'O'.
    // private static char board[0][0];
    // private static char board[0][1];
    // private static char board[0][2];
    // private static char board[1][0];
    // private static char board[1][1];
    // private static char board[1][2];
    // private static char board[2][0];
    // private static char board[2][1];
    // private static char board[2][2];
    private static char[][] board = new char[3][3];

    /* These 10 variables (spaceLeft and board[0][0] through board[2][2]) are called
       static variables.  They are different from the local variables.
       Local variables are confined within a method/function and their
       meaning is available only during the time the method is active
       (remember the large boxes that we have been drawing?  So they
       are active only during the time the box is active).  Static
       variables are non-local.  That is, they are shared by all the
       methods in the class.  Any method can access (for read and write
       accesses) the values of these variables.
    */

    /* Plan for the implementation of the TTT game:
    1. Welcome the players
    2. Display the board
       [ draw(), firstDraw() ]
    3. Repeat the following
       - indicate whose turn it is, ask for the next legal move.
         This will return a square number.
         [ getLegalMove() ]
       - update the board by putting a mark in that square
         and draw the board again.
         [ move(square, mark) ]
       - with the updated board displayed, indecate if the
         player has won or not.  If s/he has, finish the game
         [ iboard[0][2]InRow(mark) ]
       - Otherwise, if the board is full, then announce a
         tie game and finish it.
         [ isBoardFull() ]
       - Otherwise, game continues with the other player
         getting the turn.
    */

    public static void main (String[] args) {
        // Welcome the users, create and draw an empty board,
        // the first move belongs to X.
        System.out.println("Welcome to Tic Tac Toe");
        initializeBoard();
        firstDraw();
        char mark = 'X';

        // Until someone wins or the board is filled up, get
        // a legal move, make the move, and draw the board.
        // Each time through the loop the turns of X and O
        // alternate.
        while (true) {
            int square = getLegalMove(mark);
            move(square, mark);
            draw();
            if (is3InRow(mark)) {
                System.out.println(mark + " wins!");
                break;
            }
            
            if (isBoardFull()) {
                System.out.println("Tie game!");
                break;
            }
            
            if (mark == 'X') {
                mark = 'O';
            }
            else {
                mark = 'X';
            }
        }
    }

    // Pre:  mark is 'X' or 'O'
    //       The current board contains an empty square 
    // Post: Interacts with the user until the user provides the number
    //       of an empty square in the board.  It then returns that number.
    //
    public static int getLegalMove (char mark) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        while (true) {
            System.out.println(mark + "'s next move: ");
            int square = console.nextInt();
            if ((square >= 1) &&
                (square <= 9) &&
                (isSquareEmpty(square))) {
                return square;
            }
            System.out.println("\nIllegal move, try again\n");
        }
    }

    // Initializes the board to be empty.
    public static void initializeBoard () {
        spacesLeft = 9;
        // board[0][0] = board[0][1] = board[0][2] = board[1][0] = board[1][1] = ' ';  // This is how you do multiple
        // board[1][2] = board[2][0] = board[2][1] = board[2][2] = ' ';       // assignments in a hurry.

        for(int i=0; i < 3; i++)
            for(int j=0; j<3; j++)
                board[i][j] = ' ';
    }
    
    // Post: Draws the board to standard output (screen) with the
    //       square numbers
    public static void firstDraw () {
        System.out.println();
        System.out.println("   |   |   ");
        System.out.println(" " + 1 + " | " + 2 + " | " + 3);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + 4 + " | " + 5 + " | " + 6);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + 7 + " | " + 8 + " | " + 9);
        System.out.println("   |   |   ");
        System.out.println();
    }
    
    // Post: Draws the board to the standard output
    public static void draw () {
        System.out.println();
        System.out.println("   |   |   ");
        System.out.println(" " + board[0][0] + " | "
                           + board[0][1] + " | " + board[0][2]);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + board[1][0] + " | "
                           + board[1][1] + " | " + board[1][2]);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + board[2][0] + " | "
                           + board[2][1] + " | " + board[2][2]);
        System.out.println("   |   |   ");
        System.out.println();
    }
    
    // Pre:  mark is 'X' or 'O'
    //       1 <= square <= 9
    // Post: Stores the specified mark in the specified
    //       square of the board
    public static void move (int square, char mark) {
        if (isSquareEmpty(square)) {
            spacesLeft = spacesLeft - 1;
        }
        
        if (square == 1) {
            board[0][0] = mark;
        }
        else if (square == 2) {
            board[0][1] = mark;
        }
        else if (square == 3) {
            board[0][2] = mark;
        }
        else if (square == 4) {
            board[1][0] = mark;
        }
        else if (square == 5) {
            board[1][1] = mark;
        }
        else if (square == 6) {
            board[1][2] = mark;
        }
        else if (square == 7) {
            board[2][0] = mark;
        }
        else if (square == 8) {
            board[2][1] = mark;
        }
        else if (square == 9) {
            board[2][2] = mark;
        }
    }

    // Pre:  1 <= square <= 9
    // Post: Returns true if the specified square of the
    //       board is empty; returns false otherwise.
    public static boolean isSquareEmpty (int square) {
        if (square == 1) {
            return board[0][0] == ' ';
        }
        else if (square == 2) {
            return board[0][1] == ' ';
        }
        else if (square == 3) {
            return board[0][2] == ' ';
        }
        else if (square == 4) {
            return board[1][0] == ' ';
        }
        else if (square == 5) {
            return board[1][1] == ' ';
        }
        else if (square == 6) {
            return board[1][2] == ' ';
        }
        else if (square == 7) {
            return board[2][0] == ' ';
        }
        else if (square == 8) {
            return board[2][1] == ' ';
        }
        else if (square == 9) {
            return board[2][2] == ' ';
        }
        else {
            return false;
        }
    }

    // Pre:  mark is 'X' or 'O'
    // Post: Returns true if the board contains three of
    //       the specified mark in a row; returns false
    //       otherwise.
    public static boolean is3InRow (char mark) {
        return
            (board[0][0] == mark && board[0][1] == mark && board[0][2] == mark) ||
            (board[1][0] == mark && board[1][1] == mark && board[1][2] == mark) ||
            (board[2][0] == mark && board[2][1] == mark && board[2][2] == mark) ||
            (board[0][0] == mark && board[1][0] == mark && board[2][0] == mark) ||
            (board[0][1] == mark && board[1][1] == mark && board[2][1] == mark) ||
            (board[0][2] == mark && board[1][2] == mark && board[2][2] == mark) ||
            (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) ||
            (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark);
    }

    // Post: Returns true if the board contains no empty
    //       spaces; returns false otherwise.
    public static boolean isBoardFull () {
        return spacesLeft == 0;
    }
  
}
