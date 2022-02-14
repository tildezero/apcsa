package u8.p1;

import java.io.*;
import java.util.Scanner;

public class Lotto {
   public static void main(String[] args) throws FileNotFoundException {
       File f = new File("./sampleLottoNumbers1.txt");
       Scanner s = new Scanner(f);
       while (s.hasNext()) {
           System.out.println(s.nextInt());
       }
   }
}
