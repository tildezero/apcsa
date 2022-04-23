package u9labs;

import java.util.Scanner;

public class SumMajorDiagonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] m = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
               m[i][j] = s.nextDouble();
            } 
        }

        s.close();

        System.out.printf("Sum of the elements in the major diagonal is %.1f\n", sumMajorDiagonal(m));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}