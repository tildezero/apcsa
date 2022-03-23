package u9;

@SuppressWarnings("all")
public class Notes2 {
    public static void main(String[] args) {
        double[][] myOwnList = new double[10][10];
        for (int i = 0; i < myOwnList.length; i++) {
            for (int j = 0; j < myOwnList[0].length; j++) {
                myOwnList[i][j] += 0.5;
            }
        }


        double[] a = new double[myOwnList.length];
        for (int x = 0; x < myOwnList.length; x++) {
            a[x] = myOwnList[myOwnList.length - 1 - x][x];
        }
    }
}