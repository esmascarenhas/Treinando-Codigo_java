package usandothreads;


public class MinhaThreadRunnalbe implements Runnable {

    private String nome;
    private int tempo;


    public MinhaThreadRunnalbe() {
    }

    public MinhaThreadRunnalbe(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
      /*  Thread t1 = new Thread(this);
        t1.start();*/
    }


    @Override
    public void run() {


        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " Terminou a execução. ");
    }

}

