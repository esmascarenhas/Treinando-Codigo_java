package exercicios.diversos.oop.exercicios;

import exercicios.diversos.oop.Calculadora;

import java.util.Scanner;

public class UsandoDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Informe um numero, por favor:");
            num = scan.nextInt();
            if(num < 0){
                System.out.println("Desculpa! Voce digitou um numero invalido. ");
            }

            }   while (num < 0);
        System.out.println(Calculadora.fatorialNaoRecursivo(num));
        System.out.println(Calculadora.fatorialRecursivo(num));
    }
}
