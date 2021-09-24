package contribuinte.ir;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String s = "PessoaJuridica[ ";
               s += super.toString();
               s += " cnpj='" + cnpj;
               s += " imposto a ser pago: " + calcularImposto();
               s += "]";
        return s;
    }

    @Override
    public double calcularImposto() {

        return this.getRendaBruta() * 0.1;
        //return (this.getRendaBruta()/100) * 10;

    }
}
