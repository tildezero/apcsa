package u6labs;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // initialize scanner
        Scanner s = new Scanner(System.in);
        // get input
        System.out.print("side 1: ");
        int s1 = s.nextInt();
        System.out.print("side 2: ");
        int s2 = s.nextInt();
        System.out.print("side 3: ");
        int s3 = s.nextInt();
        
        if ((s1 + s2 >= s3) && (s2 + s3 >= s1) && (s3 + s1 >= s2)) {
            // if the side lengths fulfill the triangle inequality theorem, display the perimeter
            System.out.println("the perimeter is " + (s1 + s2 + s3));
        } else {
            // if the side lengths do not match the triangle inequality theorem, tell the user that the triangle is invalid
            System.out.println("invalid triangle");
        }
        s.close();
    }
}