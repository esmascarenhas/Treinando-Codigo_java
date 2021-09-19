package treinamento.oop;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Aluno {

    private String nomeAluno;
    private int matriculaAluno;
    private  String cursoAluno;
    private String[] disciplina = new String[3];
    private double[][] notasDisciplina = new double[3][4];

    public Aluno() {
    }

    public Aluno(String nomeAluno, int matriculaAluno, String cursoAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.cursoAluno = cursoAluno;
        this.disciplina = new String[3];
        this.notasDisciplina = new double[3][4];
    }
    public void mostrarInformacoes() {
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Matricula do Aluno: " + nomeAluno);
        System.out.println("Curso do Aluno: " + nomeAluno);

        System.out.println("----------------------------");
        System.out.println();

        for (int i = 0; i < disciplina.length; i++) {
            System.out.println("Notas da disciplina " + disciplina[i]);
            for (int j = 0; j < notasDisciplina[i].length; j++) {
                System.out.println(notasDisciplina[i][j] + " ");
            }
            System.out.println();
        }
    }

        public boolean verificarAprovado(int indice){
            if (obterMedia(indice) >= 7){
                return true;

            }
            return false;
        }


    public double obterMedia (int indice){

            double soma = 0;

            for (int i = 0; i< notasDisciplina[indice].length;i++){
                soma += notasDisciplina[indice][i];
                }
            double media = soma/4;
            return media;

        }



    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }


    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNotasDisciplina() {
        return notasDisciplina;
    }

    public void setNotasDisciplina(double[][] notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", matriculaAluno=" + matriculaAluno +
                ", cursoAluno='" + cursoAluno + '\'' +
                ", disciplina=" + Arrays.toString(disciplina) +
                ", notasDisciplina=" + Arrays.toString(notasDisciplina) +
                '}';
    }



}