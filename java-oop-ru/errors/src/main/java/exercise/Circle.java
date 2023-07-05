package exercise;

public class Circle {
    public Point point;
    public int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Negative radius is not allowed");
        }
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }
}
