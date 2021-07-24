package tests.lesson11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests extends BaseTest {

    @Test
    @DisplayName("Проверка метода суммирования двух чисел")
    public void calculateSumTest() {
        int sum = calculator.summ(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    @DisplayName("Проверка исключения при делении на ноль")
    public void divisionOnZeroTest() {
        try {
            int result = calculator.divide(5, 0);
            Assertions.fail();
        } catch (ArithmeticException e) {
            Assertions.assertEquals("/ by zero", e.getMessage());
            Assertions.assertEquals(ArithmeticException.class, e.getClass());
        }
    }

}
