package treinando;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Usandoswitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" Informe o dia da semana? ");
       /* int diadaSemana = leitor.nextInt();*/

/*        switch (diadaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Não é um dia da semana válido.");

        }*/
        int diautil = leitor.nextInt();
        switch (diautil) {

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Esse é um dia Útil");
                break;
            case 1:
            case 7:
                System.out.println("Esse é um Final de semana");
                break;
            default:
                System.out.println("Não é um dia da semana válido.");

        }
    }
}
