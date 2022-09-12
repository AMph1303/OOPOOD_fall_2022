import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void AreaAssertion() {
        Square sqr = new Square();
        sqr.length = 3;
        double s = sqr.area();
        Assertions.assertEquals(9, s);
    }
}