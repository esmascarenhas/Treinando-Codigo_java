package escola;

public class Pessoa {

    private String nome;
    private String endereco;
    private String cpf;
    private String email;
    private String telFixo;
    private String telCelular;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telFixo, String telCelular) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telFixo = telFixo;
        this.telCelular = telCelular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telFixo='" + telFixo + '\'' +
                ", telCelular='" + telCelular + '\'' +
                '}';
    }
    public String obterEndereco (){
      return endereco;

    }
}
