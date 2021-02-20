import arithmetics.Calculator;
import main.Main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    static int variable;

    @BeforeAll
    static void initializator(){
        variable = 1;
    }

    @Test
    void mainTest(){
        double expected = variable;
        double actual = Main.variable;
        assertEquals(expected, actual, "Main class testing error");
    }

    @Test
    void multiplicatorTest(){
        double expected = 5 * 6;
        double actual = Calculator.multiply(5, 6);
        assertEquals(expected, actual, "Multiplying error");
    }

}
