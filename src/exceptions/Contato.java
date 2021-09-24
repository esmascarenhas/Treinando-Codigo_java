package exceptions;

public class Contato {

    public static int contador = 0;
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        id = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s =  " [ " ;
               s += "id:" + id ;
               s += ", nome= " + nome + '\'' ;
               s += ", telefone: " + telefone + '\'' ;
               s += ", email: " + email + '\'' ;
               s += " ] ";
        return s;
    }
}
