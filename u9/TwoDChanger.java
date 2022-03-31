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

    public static int sum(int[] r) {
        int s = 0;
        for (int i: r) {
            s += i;
        }

        return s;
    }

    public static int[] awsr(int[][] m) {
        int[] s = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            s[i] = sum(m[i]);
        }

        return s;
    }
}
