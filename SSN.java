import java.util.Scanner;
// lab #1
public class SSN {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter an SSN: ");
       String ssn = s.nextLine();
       System.out.println(ssn.matches("\\d{4}-\\d{2}-\\d{3}") ? "Valid SSN" : "Invalid SSN");
   } 
}
