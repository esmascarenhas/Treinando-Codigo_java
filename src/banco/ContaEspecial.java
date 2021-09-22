package banco;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial[";
               s = "; limite=" + limite;
               s = "; " + super.toString();
               s = "]";
        return s;
    }

    public boolean sacar(double valor){
        double salcoComLimite = this.getSaldo()+limite;
        if((salcoComLimite - valor) >= 0){
            salcoComLimite -= valor;

            // super sacar valor
            return true;
        }
            return false;
    }
}
