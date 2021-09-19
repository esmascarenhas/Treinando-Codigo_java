package treinamento.oop.exercicios;

import treinamento.oop.Aluno;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.setNomeAluno(scan.next());

        System.out.println(aluno.getNomeAluno() + ", Informe a sua matricula, por favor: ");
        aluno.setMatriculaAluno(scan.nextInt());

        System.out.println(aluno.getNomeAluno() + ", qual o seu curso?");
        aluno.setCursoAluno(scan.next());

        for (int i = 0; i < aluno.getDisciplina().length; i++) {
            System.out.println(aluno.getNomeAluno() + ", informe o nome da " + (i + 1) + "ª disciplina");
            aluno.getDisciplina()[i] = scan.next();
        }
        for (int i = 0; i < aluno.getNotasDisciplina().length; i++) {
            System.out.println("por favor, informe as notas da diciplina " + aluno.getDisciplina()[i]);
            for (int j = 0; j < aluno.getNotasDisciplina()[i].length; j++) {
                System.out.println(aluno.getNomeAluno() + ", informe a sua " + (j + 1) + "ª nota");
                aluno.getNotasDisciplina()[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInformacoes();
        for (int i = 0; i < aluno.getDisciplina().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.getDisciplina()[i] + " - foi aprovado.");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplina()[i] + " - esta reprovado.");
            }
        }
    }
}
