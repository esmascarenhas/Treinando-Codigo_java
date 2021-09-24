package seresvivo;

import escola.Pessoa;

public class SeresVivo {
    public static void main(String[] args) {

        Animal leao = new Animal();
        leao.setAmbiente("Selva");
        leao.setComprimento(2000);
        leao.setCor("Dourado");
        leao.setVelocidade(72.5);
        leao.setNome("Leao");

        // leao tem 4 patas

        Mamifero baleia = new Mamifero();
        baleia.setAlimento("Peixes");
        baleia.setAmbiente("Maritimo");
        baleia.setCor("Azul");
        baleia.setComprimento(7000);
        baleia.setNome("Baleia");
        baleia.setVelocidade(1.5);

        Peixe arraia = new Peixe();
        arraia.setNome("Arraia Mijona");
        arraia.setCaracteristicas("mijona");
        arraia.setCor("cinzenta");
        arraia.setComprimento(3000);

        Animal[] animals = new Animal[3];
        animals[0] = arraia;
        animals[1] = baleia;
        animals[2] = leao;

        System.out.println("=============================");
            for(Animal a : animals){
                System.out.println(a);
                System.out.println("=============================");
            }

    }
}
