class NoSolutionException extends Exception {
    public NoSolutionException(String message) {
        super(message);
    }
}

public class lab10_4 {
    private static final int N = 8;

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false;

        for (int i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return false;

        return true;
    }

    public static boolean solve(int[][] board, int col) throws NoSolutionException {
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solve(board, col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }
        throw new NoSolutionException("No valid solution found");
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        try {
            solve(board, 0);
            printBoard(board);
        } catch (NoSolutionException e) {
            System.out.println(e.getMessage());
        }
    }
}