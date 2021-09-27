package usandoprintf;

import java.sql.SQLOutput;

public class ExemplosPrintf {

    public static void main(String[] args) {
        System.out.printf("%-20s","Hello, World! ");
        System.out.println();
        System.out.printf("%20S", "Hello, World! ");
        System.out.println();

        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c'); // caracter maiúsculo
        System.out.printf("%n"); //pular linha

        int valor = 14112014;
        int valor1 = -14112014;
        System.out.printf("%015d", valor);
        System.out.println();
        System.out.printf("%,d", valor);
        System.out.println();
        System.out.println(valor);

        double pontoFlutuante =3.65879;
        System.out.printf("%020f", pontoFlutuante);
        System.out.println();
        System.out.printf("%.2f", pontoFlutuante);
        System.out.println();
        System.out.printf("R$%5.2f",pontoFlutuante); // coloca o simbolo do real, espaço e 2 casas
        System.out.println();
        System.out.println(pontoFlutuante);

        System.out.printf("% d", valor);
        System.out.println();
        System.out.printf("% d", valor1);
        System.out.println();
        System.out.printf("%+d", valor);
        System.out.println();
        System.out.printf("%+d", valor1);
        System.out.println();

        testeAbrangente();
    }

    private static void testeAbrangente (){
        double[] precos = { 1000, 2, 7845.652 ,158.79 ,6.87952};
        for (int i =0; i< precos.length;i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item" , i+1, precos[i]);

        }
    }
}
