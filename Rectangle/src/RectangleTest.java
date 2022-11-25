import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(15, rectangle.computeArea());
    }
}