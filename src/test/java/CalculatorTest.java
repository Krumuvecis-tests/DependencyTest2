import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static int variable1, variable2;

    @BeforeAll
    static void setVariables() {
        variable1 = 5;
        variable2 = 6;
    }

    @Test
    void multiplicatorTest() {
        double expected = variable1 * variable2;
        double actual = Calculator.multiply(variable1, variable2);
        assertEquals(expected, actual, "Multiplying error");
    }
}