package u7labs;

public class FourPatternsC {
   public static void main(String[] args) {
      for (int i = 1; i <= 6; i++) {
         for (int j = 6; j > i; j--) {
            System.out.print(" ");
         }

         for (int b = i; b > 0; b--) {
            System.out.print("* ");
         }
         System.out.println(" ");
      } 
   } 
}
