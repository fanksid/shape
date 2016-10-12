import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tafarii on 10/12/16.
 */
public class SquareTest {
    private Rectangle squareRectangle;

    @Before
    public void setUp() throws Exception {
        int width = 5;
        squareRectangle = Rectangle.square(width);
    }

    @Test
    public void shouldReturnArea() throws Exception {
        Assert.assertEquals(25, squareRectangle.getArea(), .01);
    }
}
