// lab #2

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String st = s.nextLine();
        System.out.print("Enter the character you want to count: ");
        char c = s.next().charAt(0);
        System.out.println(c + " occurs in " + st + " " + count(st, c) + " times");
    }
    
    public static int count(String s, char c) {
        int cn = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cn++;
            }
        }

        return cn;
    }
}
