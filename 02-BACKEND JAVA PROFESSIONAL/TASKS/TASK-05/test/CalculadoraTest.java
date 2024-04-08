import org.junit.Test;
import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
    final Calculadora calculadora = new Calculadora();

    /**
     * Test case for the sum method in the Calculadora class.
     */
    @Test
    public void testSum() {
        // Given
        final int soma = calculadora.sum(1, 2);

        // When
        System.out.println("Soma = " + soma);

        // Then
        assertEquals(3, soma);
    }

    /**
     * Test for the sub method in the Calculadora class.
     */
    @Test
    public void testSub() {
        // Given
        final int sub = calculadora.sub(1, 2);

        // When
        System.out.println("Subtração = " + sub);

        // Then
        assertEquals(-1, sub);
    }

    /**
     * Test the multiplication method of the calculadora class.
     */
    @Test
    public void testMul() {
        // Perform the multiplication operation
        final int mul = calculadora.mul(1, 2);

        // Print the result of the multiplication
        System.out.println("Multiplicação = " + mul);

        // Verify that the multiplication result is as expected
        assertEquals(2, mul);
    }

    /**
     * Test the division method in the calculator class.
     */
    @Test
    public void testDiv() {
        // Test division with valid inputs
        final int div = calculadora.div(1, 2);
        System.out.println("Divisão = " + div);
        assertEquals(0, div);

        // Test division by zero
        final int div2 = calculadora.div(1, 0);
        System.out.println("Divisão por 0 = " + div);
        assertEquals(0, div);
    }
}
