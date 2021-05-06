import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class TestCalculadora {

    @Test
    public void testInstacia() {
        Calculadora calculadora = new Calculadora(0, 0);
        assertNotNull(calculadora);

    }

}
