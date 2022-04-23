// lab #4

import java.util.Scanner;

public class Password {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the password that you want to check: ");
       String pass = s.nextLine();
       boolean good = checkPass(pass);
       System.out.println(good ? "Valid Password" : "Invalid Password");
   } 

   public static boolean checkPass(String pass) {
       if (pass.length() < 8) return false;
       int dc = 0;
       for (int i = 0; i < pass.length(); i++) {
           char c = pass.charAt(i); 
           if (!Character.isLetterOrDigit(c)) return false;
           if (Character.isDigit(c)) dc++;
       }
       return dc >= 2;
       
   }
}
