package model;

public class Calculadora {
    public double raizQuadrada(double n1) {
        //Utilizando a lib math direto no return
        // validando o n1 caso for negativo
        if(n1 < 0) {
            return -1;
        }
        return(Math.sqrt(n1));
    }
}