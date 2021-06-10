import model.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    //PARTIÇÃO 01 - POSITIVA
    // Valor mais perto do 0
    // CT1: <0.01, 0.1>
    @Test
    public void raizQuadradaPertoZero() {
        double resultado = calc.raizQuadrada(0.01);
        assertEquals(0.1, resultado, 0.0001 );
    }

    // CT2: <49.99, 7.07>
    // Valor mais perto de 50
    @Test
    public void raizQuadradaProximo50() {
        double resultado = calc.raizQuadrada(49.99);
        assertEquals(7.07, resultado);
    }

    //PARTIÇÃO 02 - NULO
    // Valor 0
    // CT3: <0, 0>
    @Test
    public void raizQuadradaZero() {
        double resultado = calc.raizQuadrada(0);
        assertEquals(0, resultado);
    }

    //PARTIÇÃO 03 - NEGATIVA
    // Valor negativo
    // CT4: <-1, -1>

    @Test
    public void raizQuadradaNegativa() {
        double resultado = calc.raizQuadrada(-1);
        assertEquals(-1, resultado);
    }

}