import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void threeAndFiveShouldReturnFifteen() {
        Rectangle rectangle = new Rectangle(3, 5);
        assertEquals(15, rectangle.computeArea());
    }

    @Test
    void tenAndTenShouldReturnHundred() {
        Rectangle rectangle = new Rectangle(10, 10);
        assertEquals(100, rectangle.computeArea());
    }
}