package usandosynchronized;

public class Calculadora {

    private int soma;

    public synchronized int somarArray ( int[] array){

        int soma = 0;

        for(int i =0; i < array.length; i++){
            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName() +
                    " Somando o valor " + array[i] + " com o total de: " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return soma;
    }
}
