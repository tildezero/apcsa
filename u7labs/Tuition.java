package u7labs;

public class Tuition {
    public static void main(String[] args) {
        final int START = 10_000;
        final double RATE = .05;

        System.out.println("tuition after 10 years: " + (START * (1 + RATE * 10)));

        int sum = 0;

        for (int i = 1; i <= 4; i++) {
            sum += START * (1 + RATE * (10 + i));
        }

        System.out.println("total for 4y of college in 10 years: " + sum);
    }
}
