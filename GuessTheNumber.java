import java.util.Scanner;

public class GuessTheNumber {
   public static void main(String[] args) {
       int n = (int) (Math.random() * 101);
       Scanner s = new Scanner(System.in);
       int g = -1;
       
       while (g != n) {
           System.out.print("guess the number: ");
           g = s.nextInt();

           if (g == n) System.out.println("you win");
           else if (g > n) System.out.println("too big");
           else System.out.println("too low");
       }
   } 
}
