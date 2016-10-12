import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by tafarii on 10/12/16.
 */
public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        int width = 5;
        int height = 3;
        rectangle = Rectangle.rectangle(width, height);

    }

    @Test
    public void shouldReturnAreaOfRectangle() throws Exception {
        Assert.assertEquals(15, rectangle.getArea(), .01);

    }

}