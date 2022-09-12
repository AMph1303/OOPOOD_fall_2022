import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.Math;

class CircleTest {
    @Test
    void AreaAssertion() {
        Circle circ = new Circle();
        circ.radius = 2;
        double s = circ.area();
        Assertions.assertEquals(Math.PI*2*2, s);
    }
}