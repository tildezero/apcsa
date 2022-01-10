import java.util.Scanner;

public class RepeatAdditionQuiz {
   public static void main(String[] args) {
       int n1 = (int) (Math.random() * 10);
       int n2 = (int) (Math.random() * 10);

       Scanner in = new Scanner(System.in);

       System.out.print("what is " + n1 + " + " + n2 + "? ");
       int ans = in.nextInt();

       while (n1 + n2 != ans) {
        System.out.print("wrong. what is " + n1 + " + " + n2 + "? ");
        ans = in.nextInt();
       }

       System.out.println("you got it right");
       in.close();
   } 
}
