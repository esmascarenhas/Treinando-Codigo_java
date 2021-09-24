package contribuinte.ir;

public class PessoaFisica extends Contribuinte{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {

           String s = " Pessoa Fisica [ ";
                  s += super.toString();
                  s += " ; cpf= " + cpf;
                  s += " imposto a ser pago " + calcularImposto();
                  s += " ]";
        return s;
    }

    @Override
    public double calcularImposto() {
        double renda = this.getRendaBruta();
        if(renda<=1400){
        return 0;
        }else if(renda >1400 && renda <=2100){
            return (renda*0.1) -100;
        }
        else if(renda >2100 && renda <=2800){
            return (renda*0.15) -270;
        }
        else if(renda >2800 && renda <=3600){
            return (renda*2.5) -500;
        }
        //maior que 3.600
        return (renda*0.3) - 700;
    }
}
