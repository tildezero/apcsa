import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] mx = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[0].length; j++) {
               mx[i][j] = s.nextDouble(); 
            }
        }

        for (int i = 0; i < mx[0].length; i++) {
            double sum = sumColumn(mx, i);
            System.out.printf("Sum of the elements at column %d is %.1f\n", i, sum);
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double s = 0.0;
        for (double[] r: m) {
            s += r[columnIndex];
        }
        return s;
    }
}