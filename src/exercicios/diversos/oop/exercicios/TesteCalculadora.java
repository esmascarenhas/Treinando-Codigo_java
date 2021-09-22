package exercicios.diversos.oop.exercicios;

import exercicios.diversos.oop.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {


        imprimirResultado(Calculadora.somar(4,5));
        imprimirResultado(Calculadora.subtrair(7,3));
        imprimirResultado(Calculadora.multiplicar(6,7));
        imprimirResultado2(Calculadora.dividir(18,3));
        imprimirResultado(Calculadora.elevarPotenciaN(3,6));
        imprimirResultado(Calculadora.fatorialNaoRecursivo(5));
        imprimirResultado(Calculadora.fatorialRecursivo(6));
        imprimirResultado(Calculadora.somatorio(6));


        for(int i =1; i<20;i++){
            System.out.print(Calculadora.fibonacci(i) + " ");
        }

    }
    static void imprimirResultado(int valor){
        System.out.println(valor);
    }

    static void imprimirResultado2(double valor){
        System.out.println(valor);
    }



}
