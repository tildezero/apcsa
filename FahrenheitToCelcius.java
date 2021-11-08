import java.util.Scanner;


public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter fahrenheit: ");
        double f = input.nextDouble();

        double c = (5.0 / 9) * (f - 32);
        System.out.println("Fahrenheit " + f + " is " + c + " in Celcius.");

        input.close();
        
    }
    
}