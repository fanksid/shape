/**
 * Created by tafarii on 10/12/16.
 */
public class Rectangle implements Shape {


    private final int width;
    private final int height;

    public Rectangle(int width){
        this.width = width;
        this.height = width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

}
