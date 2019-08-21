package pl.mbatyra.calculatorservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        // given
        int a = 5;
        int b = 3;
        int expected = 8;

        // when
        int result = calculator.add(a, b);

        // then
        Assertions.assertEquals(expected, result);
    }

}
