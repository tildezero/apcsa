package u10.poemLab;

public class Runner {
    public static void main(String[] args) throws Exception {
        LineShuffler poem = new LineShuffler(PoemReader.readPoem("sonnet29.txt"));

        poem.shuffle();

        System.out.println(poem);

    }
}
