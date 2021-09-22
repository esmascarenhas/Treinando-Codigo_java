package banco;

public class ExecucaoBanco {

    public static void main(String[] args) {

        System.out.println("-------Extrato Conta Bancaria--------");
        System.out.println();

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNumConta("4522632");
        contaSimples.setNomeCliente("Emerson Mascarenhas");

        contaSimples.depositar(500);
        System.out.println("Seu Saldo Atual é: "  + contaSimples.getSaldo());

        realizarSaque(contaSimples, 200);
        System.out.println("Seu Saldo Atual é: "  + contaSimples.getSaldo());
        realizarSaque(contaSimples, 100);
        System.out.println("Seu Saldo Atual é: "  + contaSimples.getSaldo());

        System.out.println(contaSimples);

        System.out.println();
        System.out.println("--------Teste Conta Poupanca--------");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumConta("2544622");
        contaPoupanca.setNomeCliente("Tiago Sampaio");
        contaPoupanca.setDiaRendimento(10);

        contaPoupanca.depositar(1000);
        System.out.println("Seu Saldo Atual é: "  + contaPoupanca.getSaldo());

        realizarSaque(contaPoupanca, 200);
        System.out.println("Seu Saldo Atual é: "  + contaPoupanca.getSaldo());
        realizarSaque(contaPoupanca, 300);
        System.out.println("Seu Saldo Atual é: "  + contaPoupanca.getSaldo());


        System.out.println(contaPoupanca);

        if(contaPoupanca.calcularNovoSaldo(0.8)){
            System.out.println("Rendimento Aplicado! Seu novo saldo é: " + contaPoupanca.getSaldo());
        }else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado. ");
        }

        System.out.println(contaPoupanca);
        System.out.println();

        System.out.println("----------Conta Especial-----------");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNumConta("2546633");
        contaEspecial.setNomeCliente("Josi Sampaio");
        contaEspecial.setLimite(100);

        contaEspecial.depositar(600);
        System.out.println("Seu Saldo Atual é: "  + contaEspecial.getSaldo());


        realizarSaque(contaEspecial, 350);
        System.out.println("Seu Saldo Atual é: "  + contaEspecial.getSaldo());
        realizarSaque(contaEspecial,300);
        System.out.println("Seu Saldo Atual é: "  + contaEspecial.getSaldo());

        System.out.println(contaEspecial);






    }

    private static void realizarSaque( ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque no valor R$ "+ valor+ " realizado com Sucesso. Seu saldo atual é: " + conta.getSaldo());

        } else {
            System.out.println("Saldo insuficente para saque de: " + valor + " ! Por favor verifique seu Saldo: " + conta.getSaldo());
        }
    }
}
