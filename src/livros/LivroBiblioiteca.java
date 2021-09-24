package livros;

import java.util.Date;

public class LivroBiblioiteca {

    private int codigoLivro;
    private String nomeLocador;
    private String CPF;
    private Date dataLocacao;
    private Date dataDevolucao;
    private boolean statusLivro;

    public LivroBiblioiteca() {
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLocador() {
        return nomeLocador;
    }

    public void setNomeLocador(String nomeLocador) {
        this.nomeLocador = nomeLocador;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "LivroBiblioiteca{" +
                "codigoLivro=" + codigoLivro +
                ", nomeLocador='" + nomeLocador + '\'' +
                ", dataLocacao=" + dataLocacao +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
