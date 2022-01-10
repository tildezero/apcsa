package u6labs;

public class CardPicker {
    public static void main(String[] args) {
        // initialize the ranks and suits
        final String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        // pick a random rank and suit
        String rank = RANKS[(int)Math.floor(Math.random() * RANKS.length)];
        String suit = SUITS[(int)Math.floor(Math.random() * SUITS.length)];
        // print result
        System.out.println("The card you picked is the " + rank + " of " + suit);
    }
}
