package seresvivo;

public class Mamifero extends Animal{

    private String alimento;


    public Mamifero(){
        super();
        this.setCor("Rosa");
        this.setAmbiente("Mar");
        this.alimento = "Peixes";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s =  super.toString();
               s += " \nAlimento: " + alimento;

        return s;
    }
}
