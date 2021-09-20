package treinamento.oop.exercicios;

import treinamento.oop.Contador;

public class TesteContador {
    public static void imprimirValor(){
        System.out.println(Contador.obterValor());

    }

    public static void main(String[] args) {
        imprimirValor();
        Contador.incrementar();

        imprimirValor();
        Contador.zerar();

        imprimirValor();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();
    }

}
