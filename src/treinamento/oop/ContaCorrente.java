package treinamento.oop;

public class ContaCorrente {

    private String numConta;
    private String agenciaConta;
    private double saldoConta;
    private double limiteEspecial;
    private boolean statusEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(String numConta,String agenciaConta ,double saldoConta, double limiteEspecial, boolean statusEspecial) {
        this.numConta = numConta;
        this.saldoConta = saldoConta;
        this.limiteEspecial = limiteEspecial;
        this.statusEspecial = statusEspecial;
        this.agenciaConta = agenciaConta;
    }

    public boolean realizarSaque(double valorASacar){
        //tem saldo em conta
        if (saldoConta>= valorASacar){
            saldoConta -= valorASacar;
            return true;
        } else { //não tem saldo
            if (statusEspecial) {//verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldoConta;
                if (limite >= valorASacar) {
                    limite -= valorASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

    }

    public void depositar(double valorADepositar){
        saldoConta += valorADepositar;
    }

    public void consultarSaldo(){
        System.out.println(" O saldo da conta é: " + saldoConta);
    }

    public boolean vericarUsoDeChequeEspecial(){
        return saldoConta < 0;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean getStatusEspecial() {
        return statusEspecial;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numConta='" + numConta + '\'' +
                ", saldoConta=" + saldoConta +
                ", limiteConta=" + limiteEspecial +
                ", statusConta='" + statusEspecial + '\'' +
                '}';
    }
}
