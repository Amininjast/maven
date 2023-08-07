package aminhadad;

import com.aminhadad.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void canTwoAddNumbers() {
        Calculator underTest = new Calculator();
        int number1 = 10;
        int number2 = 20;
        int result = underTest.add(number1, number2);
        assertEquals(30, result);
    }

    @Test
    void canHandleWhenInputInZero() {
        Calculator underTest = new Calculator();
        int result = underTest.add(0);
        assertEquals(0, result);
    }

    @Test
    void canAddNumbersFromAGivenArray() {
        Calculator underTest = new Calculator();
        int[] numbers = {1, 5, 3};
        int result = underTest.add(numbers);
        assertEquals(9, result);
    }
}
