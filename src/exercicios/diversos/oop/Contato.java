package exercicios.diversos.oop;

public class Contato {

    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;

    public Contato() {
    }

    public Contato(String nome, Endereco endereco, Telefone[] telefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
    }

    public Contato(String nome, Endereco s, Telefone contato) {
    }

    public Contato(String s, String s1, String contato) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}

