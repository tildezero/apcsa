import java.util.Scanner;

public class FiveSixDivisible {
    public static void main(String[] args) {
        // initialize a scanner, and ask for an input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        if (n % 5 == 0 && n % 6 == 0) {
            // if the number is divisible by 5 and 6, go to first case
            System.out.println("the number is divisible by 5 and 6");
        } else if (n % 5 == 0 || n % 6 == 0) {
            // if the number is divisible by 5 or 6, execute this code
            System.out.println("the number is divisible by 5 or 6");
        } else {
            // if the number isnt divisible by 5 or 6 at all, execute this branch
            System.out.println("the number is not divisible by 5 or 6");
        }
    }
}