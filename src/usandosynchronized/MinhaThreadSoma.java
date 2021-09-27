package usandosynchronized;

public class MinhaThreadSoma implements Runnable{

        private String nome;
        private int[] numeros;
        private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;
        new Thread(this,nome).start();
       /* Thread t1 = new Thread(this,nome); //mesma coisa
                t1.start();*/
    }

    @Override
    public void run() {
        System.out.println(this.nome + " Calculadora iniciada");

        int soma = calc.somarArray(this.numeros);

        System.out.println("Resultado da soma para a Thread " + this.nome + " é: " + soma);
        System.out.println(this.nome + " está terminada");



    }
}
