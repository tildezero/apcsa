package u9labs;

import java.util.Scanner;

public class LocateLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int r = s.nextInt();
        int c = s.nextInt();
        double[][] m = new double[r][c];

        System.out.println("Enter the array:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = s.nextDouble();
            }
        }

        s.close();

        int[] lgst = locateLargest(m);
        System.out.printf("The location of the largest element is at (%d, %d)\n", lgst[0], lgst[1]);
    }    

    public static int[] locateLargest(double[][] a) {
        int lr = 0;
        int lc = 0;
        double ln = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                double v = a[i][j];
                if (v > ln) {
                    ln = v;
                    lr = i;
                    lc = j;
                }
            }
        }

        return new int[]{lr, lc}; 
    }
}
