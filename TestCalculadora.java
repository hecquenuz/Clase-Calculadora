import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class TestCalculadora {

    @Test
    public void testInstacia() {
        Calculadora calculadora = new Calculadora(0, 0);
        assertNotNull(calculadora);

    }

    @Test
    public void testValoresatributos() {
        Calculadora calculadora = new Calculadora(6, 8);
        assertEquals(6, calculadora.getA());
        assertEquals(8, calculadora.getB());
    }

    @Test
    public void testSuma() {

        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(15, calculadora.suma());

    }

    @Test
    public void testResta() {

        Calculadora calculadora = new Calculadora(8, 5);
        assertEquals(3, calculadora.resta());

    }

    @Test
    public void testMultipliacion() {

        Calculadora calculadora = new Calculadora(10, 5);
        assertEquals(50, calculadora.multiplicacion());

    }

    @Test
    public void testDivision() {

        Calculadora calculadora = new Calculadora(4, 2);
        assertEquals(2, calculadora.division());

    }

    @Test
    public void testValorabsolutoA() {

        Calculadora calculadora = new Calculadora(4, 2);
        assertEquals(4, calculadora.valorAbsolutoA());

    }

    @Test
    public void testValorabsolutoB() {

        Calculadora calculadora = new Calculadora(4, 2);
        assertEquals(2, calculadora.valorAbsolutoB());

    }

    @Test
    public void testexponente() {

        Calculadora calculadora = new Calculadora(3, 3);
        assertEquals(27, calculadora.exponente());

    }

    @Test
    public void testRaizcuadradaA() {
        Calculadora calculadora = new Calculadora(25, 5);
        assertEquals(5, calculadora.raizCuadradaA());

    }

    @Test
    public void testRaizcuadradaB() {
        Calculadora calculadora = new Calculadora(25, 4);
        assertEquals(2, calculadora.raizCuadradaB());

    }

    @Test
    public void testObjetos() {
        Calculadora calculadora = new Calculadora(18, 6);
        Calculadora calculadora2 = new Calculadora(18, 6);
        Calculadora calculadora3 = new Calculadora(28, 1);
        assertEquals(calculadora, calculadora2);
        assertNotEquals(calculadora, new Integer(2));
        assertNotEquals(calculadora, calculadora3);

    }

}
