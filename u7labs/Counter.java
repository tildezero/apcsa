import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos, neg, num, total; 
        pos = 0;
        neg = 0;
        num = 0;
        total = 0;
        System.out.print("Enter a number, input ends if it is 0: ");
        int in = -99999;
        while (in != 0) {
            in = s.nextInt();
            if (in == 0) {
                break;
            }
            num++;
            if (in > 0) {
                pos++;
            }
            if (in < 0) {
                neg++;
            }
            total += in;
        } 

        System.out.printf("positives: %d\nnegatives: %d\ntotal: %d\navg: %.2f\n", pos, neg, num, (total / (num * 1.0)));
    }
}
