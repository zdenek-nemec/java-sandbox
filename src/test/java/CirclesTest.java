import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CirclesTest {
    @Test
    public void testArea() {
        assertEquals(0, Circles.getCircleArea(0));
        assertEquals(Math.PI, Circles.getCircleArea(1));
        assertEquals(Math.PI * Math.pow(4.2, 2), Circles.getCircleArea(4.2));
    }
}
