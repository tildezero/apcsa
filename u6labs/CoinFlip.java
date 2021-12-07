import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        // initialize a scanner to get input
        Scanner s = new Scanner(System.in);
        // get the computer's coinflip result
        long correct = Math.round(Math.random());
        // ask user for their guess
        System.out.print("enter 1 for heads, 0 for tails: ");
        int guess = s.nextInt();
        if (guess == correct) {
            // if the guess matches the computer execute this branch
            System.out.println("correct!");
        } else {
            // if the guess doesn't match the computer execute this branch
            System.out.println("incorrect :( (or you didnt enter 1 or 0)");
        }

    }    
}
