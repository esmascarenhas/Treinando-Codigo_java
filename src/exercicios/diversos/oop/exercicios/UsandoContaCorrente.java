package exercicios.diversos.oop.exercicios;

import exercicios.diversos.oop.ContaCorrente;

public class UsandoContaCorrente {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setNumConta("1222445");
        conta.setLimiteEspecial(500);
        conta.setAgenciaConta("0366");
        conta.setStatusEspecial(true);
        conta.setSaldoConta(-10);

        System.out.println("O Saldo da Conta "+ conta.getNumConta()+ " = "+ conta.getSaldoConta());

        boolean saqueRealizado = conta.realizarSaque(10);
        if (saqueRealizado){
            System.out.println("Saque efetuado com sucesso. ");
            conta.consultarSaldo();
            }else{
            System.out.println("Não foi possivel realizar saque. Saldo insufuciente! ");
        }
        saqueRealizado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais ");
        if(saqueRealizado){
            System.out.println("Saque egetuado com sucesso. ");
            conta.consultarSaldo();
        }else{
            System.out.println("Não foi possivel realizar saque. Saldo insufuciente! ");
        }
        System.out.println("Deposito de 500 reais ");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.vericarUsoDeChequeEspecial()){
            System.out.println("Está usando o Limite do cheque especial. ");
        }else{
            System.out.println("Não está usando o limite de cheque especial ");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();

        if (conta.vericarUsoDeChequeEspecial()){
            System.out.println("Está usando o Limite do cheque especial. ");
        }else{
            System.out.println("Não está usando o limite de cheque especial ");
        }

    }
}
