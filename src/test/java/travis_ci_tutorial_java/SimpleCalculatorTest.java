package travis_ci_tutorial_java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.add(1, 1), 0);
    }

}
