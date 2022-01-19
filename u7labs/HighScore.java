import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = s.nextInt();

        String highest = "";
        int highScore = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("enter a name: ");
            String pers = s.next();
            System.out.print("enter a score: ");
            int score = s.nextInt();            
            if (score > highScore) {
                highScore = score;
                highest = pers;
            }
        }

        System.out.printf("%s had the highest score with a score of %d\n", highest, highScore);
    
        s.close();
    }
}

