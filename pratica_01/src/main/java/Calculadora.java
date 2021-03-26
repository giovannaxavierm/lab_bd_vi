public class Calculadora {
    // fase verde
    // Método simplificado e suficiente para passar nos testes
    public double raiz(double n1){
        double aux = n1;
        double raiz = 0;
        for (int i = 1; true ; i += 2) {
            aux -= i;
            if (aux < i) {
                raiz++;
                break;
            }
            raiz++;
        }
        return raiz;
    }
}