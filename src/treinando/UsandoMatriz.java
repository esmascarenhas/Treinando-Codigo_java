package treinando;

public class UsandoMatriz {

    public static void main(String[] args) {
      /*  double[][] notasAluno = new double[3][4];*/

       /* notasAluno[0][0] = 7;
        notasAluno[0][1] = 8.5;
        notasAluno[0][2] = 3.5;
        notasAluno[0][3] = 5.4;

        notasAluno[1][0] = 9;
        notasAluno[1][1] = 7.2;
        notasAluno[1][2] = 6.9;
        notasAluno[1][3] = 8;

        notasAluno[2][0] = 6.5;
        notasAluno[2][1] = 7.5;
        notasAluno[2][2] = 5;
        notasAluno[2][3] = 9.2;*/

        double[][] notasAluno = {{7,8.5,3.5,5.4},{9,7.2,6.9,8},{6.5,7.5,5,9.2}};


        for (int i = 0; i < notasAluno.length;i++){
            for (int j = 0; j <notasAluno[i].length; j++){
                System.out.print(notasAluno[i][j] + "-");
            }
            System.out.println();
        }
        System.out.println(" Calculando a média de cada Aluno: ");

            double soma;

        for (int i = 0; i<notasAluno.length; i++){
            soma = 0;
            for (int j = 0; j < notasAluno[i].length; j++){
                soma += notasAluno[i][j];
            }
            System.out.println("A média do aluno " + i + " é igual a: " +  (soma/4));
        }
        System.out.println();

    }
}
