import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class RectangleTest {
    @Test
    void AreaAssertion() {
        Rectangle rect = new Rectangle();
        rect.length = 2;
        rect.breadth = 5;
        double s = rect.area();
        Assertions.assertEquals(10, s);
    }
}