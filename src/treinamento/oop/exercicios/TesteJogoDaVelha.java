package treinamento.oop.exercicios;

import treinamento.oop.JogoDaVelha;

import java.util.Scanner;

public class TesteJogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("1º Jogador = X " );
        System.out.println("2º Jogador = O " );

        boolean ganhou = false;
        int linha , coluna = 0;
        char sinal;

        while (!ganhou){
            if(jogoDaVelha.vezJogador1()){
                System.out.println("É a vez do 1º Jogador. Escolha a linha e coluna (1-3). ");
                sinal = 'X';
            }else{
                System.out.println("É a vez do 2º Jogador. Escolha a linha e coluna (1-3). ");
                sinal = 'O';
            }
            linha = valor("Linha ", scan);
            coluna = valor("Coluna ", scan);

            if (!jogoDaVelha.validarJogada(linha,coluna,sinal)){
                System.out.println("Posição já utilizada. Tente novamente! ");
            }
            jogoDaVelha.imprimirTabuleiro();

            if(jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns! O 1º Jogador ganhou. ");
            }else if(jogoDaVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns! O 2º Jogador ganhou. ");
            }else if(jogoDaVelha.jogada > 9){
                ganhou = true;
                System.out.println("Empate! Nenhum Jogador venceu. Jogue novamente! ");

            }
        }

    }

    static int valor (String tipoValor, Scanner scan ){
        int valor = 0;
        boolean valorValida = false;

        while (!valorValida){
            System.out.println("Informe com a " + tipoValor + " (1 ,2 ou 3 ) ");
            valor = scan.nextInt();
            if(valor >= 1 && valor <= 3){
                valorValida = true;
            }else{
                System.out.println("Essa opção é invalida, tente novamente. ");

            }
        }
        valor--;
        return valor;
    }
}
