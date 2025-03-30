package org.bhagya.scicalcbe;

import org.bhagya.scicalcbe.service.CalcService;
import org.junit.jupiter.api.Assertions;
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


    @Test
    public void squareRootNegativeNumberTest() {
        double result = calculatorService.squareRoot(-5);

        Assertions.assertEquals(-1, result);

    }

    @Test
    public void squareRootPositiveNumberTest() {
        double result = calculatorService.squareRoot(25);

        Assertions.assertEquals(5.0, result);

    }

    @Test
    public void squareRootZeroTest() {
        double result = calculatorService.squareRoot(0);

        Assertions.assertEquals(0, result);

    }

    @Test
    public void factorialOfNegativeNumberTest() {
        double result = calculatorService.factorial(-3);
        Assertions.assertEquals(-1, result);
    }


    @Test
    public void factorialOfPositiveNumberTest() {
        double result = calculatorService.factorial(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void naturalLogNegativeNumberTest() {
        double result = calculatorService.naturalLog(-3);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void naturalLogZeroTest() {
        double result = calculatorService.naturalLog(0);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void naturalLogPositiveNumberTest() {
        double result = calculatorService.naturalLog(10);
        Assertions.assertEquals(Math.log(10), result);
    }

    @Test
    public void powerOfTest() {
        double result = calculatorService.power(10,3);
        Assertions.assertEquals(1000, result);
    }

}
