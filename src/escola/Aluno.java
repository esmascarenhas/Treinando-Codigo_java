package escola;

import java.util.Arrays;

public class Aluno extends Pessoa {

    private String curso;
    private String matricula;
    private double[] notas;

    public Aluno() {

    }


    public Aluno(String nome, String endereco, String telFixo, String telCelular, String curso) {
        super(nome, endereco, telFixo, telCelular);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", matricula='" + matricula + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public double obterMedia() {


        double soma = 0;
        for (double notas : notas) {
            soma += notas;

        }
        return soma / 4;

    }
    private String obterAprovacao(){
        String info = "Notas do Aluno: " + notas;
        info += notas + " ";

        double soma = 0;
        for (double notas : notas) {
            soma += notas;

        }

        double media = soma/4;

        info += "\n" + "Media: " + media + " - ";
        if (media >= 7) {
            info += "Aluno Aprovado!";
        } else {
            info += "Aluno Reprovado!";
        }
        return info;

    }

    //this pega os metodos da mesma classe enquanto o super da classe mae.
    public void metodoTeste(){
        super.setCpf("25445522");
        this.setCpf("25544522");

    }
    public String obterEndereco(){
        String s = "Endereço pelo Aluno: ";
        s += super.getEndereco();

        return s;
    }
}
