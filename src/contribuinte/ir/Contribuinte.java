package contribuinte.ir;

public abstract class Contribuinte {

    private String nomeContribuinte;
    private double rendaBruta;

    public String getNomeContribuinte() {
        return nomeContribuinte;
    }

    public void setNomeContribuinte(String nomeContribuinte) {
        this.nomeContribuinte = nomeContribuinte;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {

        String s = "nomeContribuinte='" + nomeContribuinte;
               s += " ;rendaBruta=" + rendaBruta;
               s += "]";
        return s;
    }
    public abstract double calcularImposto();
}
