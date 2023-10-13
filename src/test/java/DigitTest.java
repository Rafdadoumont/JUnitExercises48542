import org.example.Digit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitTest {

    Digit digit;

    @BeforeEach
    public void setup() {
        digit = new Digit();
    }

    @Test
    public void countTest() {
        int number = 1234567;
        assertEquals(7, digit.getCountDigit(number));
    }

    @Test
    public void averageTest() {
        int number = 234;
        assertEquals(3, digit.getAverageDigit(number));

        number = 56789;
        assertEquals(7, digit.getAverageDigit(number));
    }
}
