package u9;
public class ShuffleOneRow {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        
        int rownum = (int) (Math.random() * arr.length);
        int[] row = arr[rownum];

        for (int c = 0; c < row.length; c++) {
            // choose random location
            int index = (int) (Math.random() * arr[0].length);

            // swap them
            int temp = row[c];
            row[c] = row[index];
            row[index] = temp; 

        }
    }
}