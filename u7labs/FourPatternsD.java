package u7labs;

public class FourPatternsD {
   public static void main(String[] args) {
      for (int i = 6; i >= 1; i--) {
         for (int j = 6; j > i; j--) {
            System.out.print(" ");
         }

         for (int b = 1; b <= i; b++) {
            System.out.print(b + " ");
         }
         System.out.println(" ");
      } 
   } 
}

