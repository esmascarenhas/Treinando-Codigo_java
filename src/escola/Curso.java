package escola;

import java.util.Arrays;

public class Curso {

    private String nomeCurso;
    private String horarioCurso;
    private Professor professor;
    private Aluno[] alunos;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorarioCurso() {
        return horarioCurso;
    }

    public void setHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' + "\n" +
                ", horarioCurso='" + horarioCurso + '\'' + "\n" +
                ", professor=" + professor +  "\n"+
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }

    /*public String obterInformacoes() {
            String info = "Nome do Curso: " + nomeCurso + "\n";
            if (professor != null) {
                info += professor.toString();
            }

            if (alunos != null) {
                System.out.println("-----Alunos-----");
                for (Aluno aluno : alunos) {
                    if (aluno !=null){
                    info += alunos.toString();
                    info += "\n";
                    }
                }
                info += "\nMedia da Turma " + obterMediaDaTurma()   ;
            }
            return info;
        }
    */
    public double obterMediaDaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }
}
