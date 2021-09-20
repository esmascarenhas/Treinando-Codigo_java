package treinamento.oop.exercicios;

import treinamento.oop.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {


        imprimirResultado(Calculadora.somar(4,5));
        imprimirResultado(Calculadora.subtrair(7,3));
        imprimirResultado(Calculadora.multiplicar(6,7));
        imprimirResultado2(Calculadora.dividir(18,3));
        imprimirResultado(Calculadora.elevarPotenciaN(3,6));

    }
    static void imprimirResultado(int valor){
        System.out.println(valor);
    }
    static void imprimirResultado2(double valor){
        System.out.println(valor);
    }
}
