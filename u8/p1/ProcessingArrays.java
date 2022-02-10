package u8;

public class ProcessingArrays {
    public static void main(String[] args) {
        double[] myList = new double[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

        double max = myList[0];
        for (double d: myList) {
            if (d > max) {
                max = d;
            }
        }
    }
}
