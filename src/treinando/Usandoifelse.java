package treinando;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Usandoifelse {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Por favor,Informe qual o tipo de combustivel deseja: ");
        System.out.println("Digite 'A' para Álcool");
        System.out.println("Digite 'G' para gasolina");
        String type = scaner.next();
        System.out.println("Quantos litros deseja colocar? ");
        double liters = scaner.nextDouble();

        final double precoGas = 2.5;
        final double precoAlc = 1.9;
        int perDesconto = 0;
        double total = 0;
        double totalDesc = 0;


        if (type.equalsIgnoreCase("a")) {
            if (liters <= 20) {
                perDesconto = 3;
            } else {
                perDesconto = 5;
            }
            total = precoAlc * liters;

        } else if (type.equalsIgnoreCase("g")) {
            if (liters <= 20) {
                perDesconto = 4;
            } else {
                perDesconto = 6;
            }
            total = precoGas * liters;
        }
        totalDesc = (total / 100) * perDesconto;
        double precoaPagar = total - totalDesc;

        System.out.println(" O preço a Pagar é de: " + precoaPagar);

    }
}
