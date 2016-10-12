import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tafarii on 10/12/16.
 */
public class CircleTest {
    private Circle circle;

    @Before
    public void setUp() throws Exception {
        int radius = 5;
        circle = new Circle(radius);

    }

    @Test
    public void shouldReturnTheAreaOfCircle() throws Exception {
        Assert.assertEquals(Math.PI*25, circle.getArea(), .01);

    }

    @Test
    public void shouldReturnThePerimeter() throws Exception {
        Assert.assertEquals(Math.PI*10, circle.getPerimeter(), .01);

    }
}
