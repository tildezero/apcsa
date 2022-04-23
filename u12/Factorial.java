package u12;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("3! is " + factorial(3));
        System.out.println("4! is " + factorial(4));
        System.out.println("5! is " + factorial(5));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }    
}
