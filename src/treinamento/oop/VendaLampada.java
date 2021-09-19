package treinamento.oop;

public class VendaLampada {

        private String marcaLampada;
        private int qtdLampada;
        public String[] potenciaLampada;
        private double valorLampada;


    public VendaLampada() {
    }

    public VendaLampada(String marcaLampada, double valorLampada, int qtdLampada) {
        marcaLampada = marcaLampada;
        this.qtdLampada = qtdLampada;
        this.valorLampada = valorLampada;
    }

    public String getMarcaLampada() {
        return marcaLampada;
    }

    public double getValorLampada() {
        return valorLampada;
    }

    public void setValorLampada(double valorLampada) {
        this.valorLampada = valorLampada;
    }

    public void setMarcaLampada(String marcaLampada) {
        marcaLampada = marcaLampada;
    }

    public int getQtdLampada() {
        return qtdLampada;
    }

    public void setQtdLampada(int qtdLampada) {
        this.qtdLampada = qtdLampada;
    }

    boolean lampadaLigaga;

    public void ligar(){
        lampadaLigaga =true;
    }
    public void desligar(){
        lampadaLigaga = false;
    }
    public void mostrarEstado () {
        if (lampadaLigaga) {
            System.out.println(" A lampada está ligada ");
        } else {
            System.out.println("A lampada está desligada");
        }
    }
    public void mudarEstado(){
        if (lampadaLigaga){
            desligar();
        }else{
            ligar();
        }
    }




        @Override
    public String toString() {
        return "VendaLampada{" +
                "MarcaLampada='" + marcaLampada + '\'' +
                ", qtdLampada=" + qtdLampada +
                ", potenciaLampada='" + potenciaLampada + '\'' +
                ", valorLampada=" + valorLampada +
                '}';
    }
}
