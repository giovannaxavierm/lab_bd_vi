package app;
import model.Calculadora;
public class Application {
    public static void main(String [] args) {
        /* Método principal da aplicação. É instanciado a Calculadora para chamar a raiz quadrada do numero 9
        e imprime o resultado */
        Calculadora calc = new Calculadora();
        System.out.print("\nA raiz quadrada de 9 é:\n" + calc.raizQuadrada(9) + "\n\n");
        }
}

