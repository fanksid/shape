/**
 * Created by tafarii on 10/12/16.
 */
public class Circle implements Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return Math.PI*2*radius;
    }
}
