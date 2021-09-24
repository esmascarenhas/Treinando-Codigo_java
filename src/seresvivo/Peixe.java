package seresvivo;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
        super();
        this.setAmbiente("Maritimo");
        this.setCor("Colorido");
        this.setNumPatas(0);
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
               s += " \nCaracteristicas =' " + caracteristicas + '\'';

        return s;
    }
}
