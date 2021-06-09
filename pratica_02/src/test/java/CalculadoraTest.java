import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    //PARTIÇÃO 01
    // CT1: <0, 0>
    @Test
    public void raizQuadradaZero() {
        double resultado = calc.raizQuadrada(0);
        assertEquals(0, resultado, 0.0001);
    }

    //PARTIÇÃO 02
    // CT2: <-999.9, 31.62>

    public void raizQuadradaLimite() {
        double resultado = calc.raizQuadrada(999.9);
        assertEquals(31.62, resultado, 0.0001);
    }

    //PARTIÇÃO 03
    // CT3: <-0.01, -1>
    // -1 é o resultado de erro ja que nao existe raiz de numero negativo
    @Test
    public void raizQuadradaNegativa() {
        double resultado = calc.raizQuadrada(-0.01);
        assertEquals(-1, resultado, 0.0001);
    }

}
