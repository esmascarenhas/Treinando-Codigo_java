package treinamento.oop.exercicios;

import treinamento.oop.VendaLampada;



public class Lampada {
    public static void main(String[] args) {
        VendaLampada vendaLampada = new VendaLampada();
        vendaLampada.setMarcaLampada("Brilux");
        vendaLampada.setQtdLampada(4);
        vendaLampada.setValorLampada(25.6);

       vendaLampada.potenciaLampada = new String[3];
       vendaLampada.potenciaLampada[0] = "40w";
       vendaLampada.potenciaLampada[1] = "60w";
       vendaLampada.potenciaLampada[2] = "100w";

        System.out.println("Marca: " + vendaLampada.getMarcaLampada() + " - Quantidade: " + vendaLampada.getQtdLampada() + " - Valor: " + vendaLampada.getValorLampada());

        vendaLampada.ligar();
        vendaLampada.mostrarEstado();
        vendaLampada.desligar();
        vendaLampada.mostrarEstado();
        vendaLampada.mudarEstado();
        vendaLampada.mostrarEstado();
    }

}
