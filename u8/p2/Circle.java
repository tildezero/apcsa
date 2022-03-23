package u8.p2;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    // Derived getters and setters
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * (radius * 2); 
    }

    public void dilate(double sf) {
        radius *= sf;
    }

    public boolean equals(Object o) {
        if (o instanceof Circle) return false;
        return this.radius == ((Circle) o).getRadius();
    }

    public String toString() {
        return "Circle of radius: " + this.radius;
    }
}
