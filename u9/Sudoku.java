package u9;
public class Sudoku {
    private int[][] puzzle;

    public boolean isValidSolution() {
        // check each row
        for (int[] row: this.puzzle) 
            if (!contains19(row)) return false;
        // check each column
        for (int col = 0; col < this.puzzle[0].length; col++) {
            int[] column = new int[this.puzzle[0].length];
            for (int row = 0; row < this.puzzle.length; row++) {
                column[row] = this.puzzle[row][col];
            }

            if (!contains19(column)) return false;
        }

        // check each square
        for (int j = 0; j < 9; j += 3) {
            for (int k = 0; k < 9; k += 3) {
                int[] square = createArrayFromSquare(j, k);
                if (!contains19(square)) return false;
            }
        }

        return true;

    }

    private int[] createArrayFromSquare(int sr, int sc) {
        int[] arr = new int[9];
        int index = 0;
        for (int row = sr; row < sr + 3; row++) {
            for (int col = sc; col < sc + 3; col++) {
                arr[index++] = this.puzzle[row][col];
            }
        }
        return arr;
    }

    private static boolean contains19(int[] a) {
        // returns true if array has 9 integers all from 1 to 9
        return true;

    } 
    
}
