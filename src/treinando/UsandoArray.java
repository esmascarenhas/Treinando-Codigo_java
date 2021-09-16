package treinando;

import java.util.Scanner;

public class UsandoArray {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < vetorA.length;i++){
            System.out.println("Por favor, digite o valor da posição " + i + ":");
            vetorA[i] = scanner.nextInt();
        }
        int impar = 0;
        for (int i =0; i < vetorA.length;i++){
            if (vetorA[i] % 2 !=0){
            impar++;
            }
        }

        int par = vetorA.length - impar;

        double perPar = (par * 100)/vetorA.length;
        double perImpar = 100 - perPar;


        System.out.print("Os valores do Vetor A são: " );
        for(int i = 0; i < vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("O percentual de valores pares são: " + perPar);
        System.out.println("O percentual de valores impares são: " + perImpar);

    }
}
