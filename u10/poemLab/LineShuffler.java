package u10.poemLab;
import java.util.ArrayList;

public class LineShuffler {
    private ArrayList<String> lines;

    public LineShuffler(ArrayList<String> poem) {
        this.lines = poem;
    }

    public int size() {
        return this.lines.size();
    }

    public String toString() {
        return this.lines.toString();
    }

    public String get(int k) {
        return this.lines.get(k);
    }

    public void add(String line) {
        this.lines.add(line);
    }

    public String remove(int k) {
        return this.lines.remove(k);
    }

    public void move(int index, int newIndex) {
        // lines.add(newIndex, get(index)); remove(index);
        lines.add(newIndex, remove(newIndex));
    }

    public void shuffle() {
        int i = 0;
        while (i < size()) {
            int pick = (int) (Math.random() * lines.size());
            String temp = get(i);
            move(pick, i);
            lines.set(pick, temp);
            i++;
        }
    }
}