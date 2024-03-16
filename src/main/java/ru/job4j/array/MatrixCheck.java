package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoVertical(char[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoHorizontal(char[][] board, int raw) {
        for (int i = 0; i < board.length; i++) {
            if (board[raw][i] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}