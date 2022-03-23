package u9;
// import java.util.Scanner;

public class ProcessingTwoDimArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        // Scanner s = new Scanner(System.in);

        // 1. taking input and placing it into a 2d array 
        // System.out.println("enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        // for (int r = 0; r < matrix.length; r++) {
            // for (int c = 0; c < matrix[r].length; c++) {
                // matrix[r][c] = s.nextInt();
            // }
        // }

        // 2. making a matrix with random values
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = (int)(Math.random() * 10);
            }
        }

        System.out.println();

        // 3. print elements of a 2d array
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        // sum a 2d array 
        int sum = 0;

        for (int[] arr: matrix) {
            for (int i: arr) {
                sum += i;
            }
        }

        // summing by column
        for (int c = 0; c < matrix[0].length; c++) {
            int ctotal = 0;
            for (int r = 0; r < matrix.length; r++) {
                ctotal += matrix[r][c];
            }
            System.out.println("total of col " + c + " is " + ctotal);
        }

        System.out.println("the sum is: " + sum);

        // shuffling an array
        // loop through whole array
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                // randomly choose one location
                int randRow = (int)(Math.random() * matrix.length);
                int randCol = (int)(Math.random() * matrix[0].length);
                
                int temp = matrix[r][c];
                matrix[r][c] = matrix[randRow][randCol];
                matrix[randRow][randCol] = temp;

            }
        }

        
    }
}
