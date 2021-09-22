package escola;

import java.util.Scanner;

public class TesteEscola {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do seu curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Qual o horário desse curso? ");
        String horario = scan.nextLine();

        System.out.println("Informe o nome do professor desse curso: ");
        String prof = scan.nextLine();

        System.out.println("Qual o departamento desse professor? ");
        String depProf = scan.nextLine();

        System.out.println("Informe o email desse professor: ");
        String emailProf = scan.nextLine();

      Pessoa aluno1 = new Aluno();
      Pessoa professor = new Professor();

      aluno1.getNome();
      professor.getCpf();

      Curso curso = new Curso();
      curso.setNomeCurso(nomeCurso);
      curso.setHorarioCurso(horario);

      Professor professores = new Professor();
      professores.setDepartamento(depProf);
      professores.setNome(prof);
      professores.setEmail(emailProf);

      curso.setProfessor(professores);

        System.out.println("----Alunos----");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0 ; i < 5; i++){
            scan.nextLine();
            System.out.println("Informe o nome do "+ (i+1) + "º Aluno: ");
            String nomeAluno = scan.nextLine();
            System.out.println("Informe a matricula do "+ (i+1) + "º Aluno: ");
            String matAluno = scan.nextLine();

            double[] notasAlunos = new double[4];
                for(int j = 0; j < 4; j++){
            System.out.println("Informe a "+ (j+1) +  "º nota do Aluno: ");
             notasAlunos[j] = scan.nextDouble();}

                Aluno aluno = new Aluno();
                aluno.setNome(nomeAluno);
                aluno.setMatricula(matAluno);
                aluno.setNotas(notasAlunos);

                alunos[i] = aluno;

                }

                curso.setAlunos(alunos);
        System.out.println(curso);

        Pessoa alu = new Aluno();
        Pessoa pro = new Professor();
        Pessoa pessoa = new Pessoa();

        alu.setEndereco("Rua Silveira Martins , Rua Francisco Rosa ");
        pro.setEndereco("Rua Silveira Martins , Rua Francisco Rosa ");
        pessoa.setEndereco("Rua Silveira Martins , Rua Francisco Rosa ");

        System.out.println();

        System.out.println(alu.obterEndereco());
        System.out.println(pro.obterEndereco());
        System.out.println(pessoa.obterEndereco());

    }
}
