package treinando;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas pessoas serão entrevistadas? ");
        int numEntrevistados = input.nextInt();
        String[][] nomeFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println("Quantos filhos possui o " + (i+1) + "º entrevistado?");
            int qtdFilhos = input.nextInt();

            nomeFilhos[i] = new String[qtdFilhos];
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println("Qual o nome do " + (j + 1) + "º filho? ");
                nomeFilhos[i][j] = input.next();

            }

        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(" Resultado da Entrevista: ");
        System.out.println("----------------------------");
        for (int i = 0; i < nomeFilhos.length; i++) {
            System.out.println(" A " + (i+1) + "ª pessoa tem " + nomeFilhos[i].length + " filhos ");
            for (int j = 0; j < nomeFilhos[i].length; j++) {
                System.out.println( nomeFilhos[i][j]);
            }
        }
    }
}
