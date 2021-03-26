import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
        // O método verificará se o calculo de raiz quadrada vai retorar o resultado correto
        @Test
        public void testeRaizQuadrada(){
            Calculadora c = new Calculadora();
            double result = c.raiz(4);
            assertEquals(2,result);
        }


}
