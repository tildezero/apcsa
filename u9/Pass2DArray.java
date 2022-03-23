package u9;
import java.util.Scanner;

public class Pass2DArray {
    public static void main(String[] args) {
        int[][] m = getArray();

        for (int[] r: m) {
            for (int i: r) {
               System.out.print(i + " "); 
            }
            System.out.println();
        }

        System.out.println("sum is " + getSum(m));
         
    }

    public static int[][] getArray() {
       int[][] m = new int[3][4];
       for (int r = 0; r < m.length; r++) {
           for (int c = 0; c < m[r].length; c++) {
               m[r][c] = (int)(Math.random() * 10);
           }
       } 
       
       return m;
    }

    public static int getSum(int[][] m) {
        int sum = 0;
        for (int[] r: m) {
            for (int i: r) {
                sum += i;
            }
        }

        return sum;
    }
    
}
