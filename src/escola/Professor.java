package escola;

public class Professor extends Pessoa{

    private double salario;
    private String departamento;
    private String nomeDoCurso;

    public Professor() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public double calcularSalarioLiquido(){

        return 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "Nome do Professor=" + getNome() +
                ", departamento='" + departamento + '\'' +
                ", email " + getEmail() + '\'' +
                '}';
    }
    public String obterEndereco(){
        String s = "Endereco pelo Professor: ";
        s += super.getEndereco();
        return s;
    }
}
