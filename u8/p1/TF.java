package u8.p1;

import java.util.Scanner;
import java.io.*;

public class TF {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("./sampleNumbers.txt");
        Scanner s = new Scanner(f);

        double[] ns = new double[100];

        for (int i = 0; i < ns.length - 1; i++) {
            ns[i] = s.nextDouble();
        }

        double max = ns[0], min = ns[0], sum = 0;
        int nga = 0;

        // avg

        for (double v: ns) {
            sum += v;
        }
        double avg = sum / (ns.length * 1.0);

        // for (int i = 0; i < ns.length - 1; i++) {
        //     sum += ns[i];
        // }
        // double avg = sum / (ns.length * 1.0);

        // # of items > avg

        for (double v: ns) {
            if (v > avg) {
                nga++;
            }
        }

        // for (int i = 0; i < ns.length - 1; i++) {
        //     if (ns[i] > avg) {
        //         nga++;
        //     }
        // }

        // max

        for (double v: ns) {
            if (v > max) {
                max = v;
            }
        }

        // for (int i = 0; i < ns.length - 1; i++) {
        //     if (ns[i] > max) {
        //         max = ns[i];
        //     }
        // }

        // min

        for (double v: ns) {
            if (v < min) {
                min = v;
            }
        }

        // for (int i = 0; i < ns.length - 1; i++) {
        //     if (ns[i] < min) {
        //         min = ns[i];
        //     }
        // }

        System.out.printf("avg: %.2f\n# items > avg: %d\nmax: %.1f, min: %.1f\n", avg, nga, max, min);


    } 
}
