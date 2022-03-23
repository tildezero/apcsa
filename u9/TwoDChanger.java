package u9;

public class TwoDChanger {
    public static void main(String[] args) {
        int ro = (int)(Math.random() * 11 + 10);
        int co = (int)(Math.random() * 11 + 10);    

        int[][] m = new int[ro][co];

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                m[r][c] = (int)(Math.random() * 100);
            }
        }
    }
}
