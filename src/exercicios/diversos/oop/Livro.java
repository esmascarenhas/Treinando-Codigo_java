package exercicios.diversos.oop;

public class Livro {

    private String tituloLivro;
    private String generoTextualLivro;
    private String categoriaLivro;
    private String autorLivro;
    private int qtdPaginasLivro;


    public Livro() {
    }

    public Livro(String tituloLivro, String generoTextualLivro, String categoriaLivro, String autorLivro, int qtdPaginasLivro) {
        this.tituloLivro = tituloLivro;
        this.generoTextualLivro = generoTextualLivro;
        this.categoriaLivro = categoriaLivro;
        this.autorLivro = autorLivro;
        this.qtdPaginasLivro = qtdPaginasLivro;

    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getGeneroTextualLivro() {
        return generoTextualLivro;
    }

    public void setGeneroTextualLivro(String generoTextualLivro) {
        this.generoTextualLivro = generoTextualLivro;
    }

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getQtdPaginasLivro() {
        return qtdPaginasLivro;
    }

    public void setQtdPaginasLivro(int qtdPaginasLivro) {
        this.qtdPaginasLivro = qtdPaginasLivro;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "tituloLivro='" + tituloLivro + '\'' +
                ", generoTextualLivro='" + generoTextualLivro + '\'' +
                ", categoriaLivro='" + categoriaLivro + '\'' +
                ", autorLivro='" + autorLivro + '\'' +
                ", qtdPaginasLivro=" + qtdPaginasLivro +
                '}';
    }
}
