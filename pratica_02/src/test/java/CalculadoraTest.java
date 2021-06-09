import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    //PARTIÇÃO 01
    //Valores válidos
    // CT1: <0, 0>
    @Test
    public void raizQuadradaPositiva() {
        double resultado = calc.raizQuadrada(9);
        assertEquals(3, resultado);
    }

    //PARTIÇÃO 02
    // Valores inválidos
    // -1 é o resultado de erro ja que nao existe raiz de numero negativo
    @Test
    public void raizQuadradaNegativa() {
        double resultado = calc.raizQuadrada(-1);
        assertEquals(-1, resultado);
    }

}
