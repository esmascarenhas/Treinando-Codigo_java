package usuarios;

public class Product {
    private String name;
    private String descrição;
    private int quantidade;

    public Product(String name, String descrição, int quantidade) {
        this.name = name;
        this.descrição = descrição;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return name + descrição + quantidade;
    }
}