package treinamento.oop.exercicios;

import treinamento.oop.Contato;
import treinamento.oop.Endereco;
import treinamento.oop.Telefone;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Emerson");

        //criar objeto telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd(71);
        tel.setNumero("9999-85522");


        //criar objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Silveira Martins");
        end.setNumero(777);
        end.setCep("544822275");
        end.setCidade("Salvador");
        end.setComplemento("torre hip hop");
        end.setEstado("Bahia");
        end.setPais("Brasil");

        System.out.println(contato.getNome());

        //primeiro tem que setar o objeto antes de realizar o get.

        contato.setTelefone(tel);
        if(contato != null && contato.getTelefone() != null) {

            System.out.println(contato.getTelefone().getTipo());
            System.out.println(contato.getTelefone().getDdd());
            System.out.println(contato.getTelefone().getNumero());
        }

        //primeiro tem que setar o objeto antes de realizar o get.
        contato.setEndereco(end);

        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNomeRua());
            System.out.println(contato.getEndereco().getCidade());
            System.out.println(contato.getEndereco().getEstado());
            System.out.println(contato.getEndereco().getCep());
            System.out.println(contato.getEndereco().getPais()  );
        }
    }
}
