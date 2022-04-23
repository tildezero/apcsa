// lab #6

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: \t");
        String num = s.nextLine();
        String nn = "";
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isAlphabetic(num.charAt(i))) {
                nn += num.charAt(i);
            } else {
                nn += getNumber(Character.toLowerCase(num.charAt(i)));
            }
        }

        System.out.println(nn);
        
    }

    public static int getNumber(char c) {
        switch(c) {
            case 'a': case 'b': case 'c': return 2;
            case 'd': case 'e': case 'f': return 3;
            case 'g': case 'h': case 'i': return 4;
            case 'j': case 'k': case 'l': return 5;
            case 'm': case 'n': case 'o': return 6;
            case 'p': case 'q': case 'r': case 's': return 7;
            case 't': case 'u': case 'v': return 8;
            case 'w': case 'x': case 'y': case 'z': return 9;
            default: return -1;
        }
    }
}