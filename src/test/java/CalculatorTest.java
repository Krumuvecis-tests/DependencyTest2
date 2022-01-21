import DependencyTest2.Calculator;
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
        int expected = variable1 * variable2;
        int actual = Calculator.multiply(variable1, variable2);
        assertEquals(expected, actual, "Multiplying error");
    }
}