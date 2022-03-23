package u8.p2;

public class InitWithLoops {
    public static void main(String[] args) {
        Circle[] aoc = new Circle[6];
        for (int i = 0; i < aoc.length; i++) {
            aoc[i] = new Circle((int)(Math.random() * 12) + 2);
        }
        
        Circle[] cl = {new Circle(3), new Circle(), new Circle(7)};

        for (Circle c: cl) {
            System.out.println("radius is " + c.getRadius());
        }

        // its like changing the circle without changing it (radius changes since we're using a setter, but not a reference)
        for (Circle c: cl) {
            c.setRadius(26);
        }

    }
}
