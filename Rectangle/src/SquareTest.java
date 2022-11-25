import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void twoShouldReturnFour(){
        Square square = new Square(2);
        assertEquals(4, square.computeArea());
    }

    @Test
    void threeShouldReturnNine(){
        Square square = new Square(3);
        assertEquals(9, square.computeArea());
    }

    @Test
    void tenShouldReturnHundred(){
        Square square = new Square(10);
        assertEquals(100, square.computeArea());
    }
}