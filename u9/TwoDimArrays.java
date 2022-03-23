package u9;

public class TwoDimArrays {
    public static void main(String[] args) {
        // making 2d arrays: elementType[][] reference; or elementType reference[][] (bad)
        int[][] matrix = new int[5][5];
        // first subscript = row, second = column (rc-cola)
        matrix[2][1] = 7; // access row 3 col 2
        // making an array w/ array initializer (the {})
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        array[0][0] = 1; array[0][1] = 2; array [0][2] = 3; // same as above but more tedious

        // length of a 2d array
        // array[0] is an int[]
        // array[array.length - 1] last array in the array
        System.out.println(array.length); // num of rows
        System.out.println(array[0].length); // num of columns in a row (0 can be substituted for any index)

        
    }
}