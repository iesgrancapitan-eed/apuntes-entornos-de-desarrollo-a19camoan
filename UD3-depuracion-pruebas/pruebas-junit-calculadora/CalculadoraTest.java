import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

  @Test
  void testSumar() {
    assertEquals(-1, Calculadora.sumar(2, -3));
    assertEquals(2, Calculadora.sumar(2, 0));
    assertEquals(-5, Calculadora.sumar(-2, -3));
  }

  @Test
  void testRestar() {
    assertEquals(5, Calculadora.restar(2, -3));
    assertEquals(2, Calculadora.restar(2, 0));
    assertEquals(-1, Calculadora.restar(2, 3));
  }

  @Test
  void testMultiplicar() {
    assertEquals(0, Calculadora.multiplicar(8, 0));
    assertEquals(-6, Calculadora.multiplicar(-2, 3));
    assertEquals(0, Calculadora.multiplicar(0, -3));
    assertEquals(-3, Calculadora.multiplicar(1, -3));
  }

  @Test
  void testDividir() {
    assertEquals(-0.33333333, Calculadora.dividir(1, -3), 0.01);
    assertEquals(0, Calculadora.dividir(0, 3));
    assertEquals(Double.POSITIVE_INFINITY, Calculadora.dividir(3, 0));
    assertEquals(Double.NEGATIVE_INFINITY, Calculadora.dividir(-3, 0));
  }

}
