import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.println("enter an int");
        int i = input.nextInt();
        System.out.println(i);
        input.close();

    }    
}
