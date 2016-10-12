/**
 * Created by tafarii on 10/12/16.
 */
public class Rectangle implements Shape {


    private final int width;
    private final int height;


    private Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static Rectangle rectangle (int width, int height){
        return new Rectangle(width, height);
    }

    static Rectangle square (int width){
        return new Rectangle(width, width);
    }

    public double getArea() {
        return width*height;
    }

}
