import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 3;

        int expectedValue = a + b;
        int actualValue = calculator.sum(a, b);

        assertEquals(expectedValue, actualValue, "Error calculating sum");
    }
}
