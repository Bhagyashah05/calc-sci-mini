package org.bhagya.scicalcbe;

import org.bhagya.scicalcbe.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SciCalcBeApplicationTests {

    private final CalcService calculatorService = new CalcService();

    @Test
    void testSquareRoot() {
        assertEquals(4, calculatorService.squareRoot(16), 0.001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculatorService.factorial(5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0, calculatorService.naturalLog(1), 0.001);
    }

    @Test
    void testPower() {
        assertEquals(8, calculatorService.power(2, 3), 0.001);
    }

}
