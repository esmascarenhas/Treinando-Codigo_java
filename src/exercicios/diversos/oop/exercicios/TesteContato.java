package exercicios.diversos.oop.exercicios;

import exercicios.diversos.oop.Contato;
import exercicios.diversos.oop.Telefone;
import exercicios.diversos.oop.Endereco;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Emerson");

        //criar objeto telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd(71);
        tel.setNumero("9999-85522");

        Telefone tel1 = new Telefone();
        tel1.setTipo("Fixo");
        tel1.setDdd(71);
        tel1.setNumero("35224-6552");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel1;


        //criar objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Silveira Martins");
        end.setNumero(777);
        end.setCep("544822275");
        end.setCidade("Salvador");
        end.setComplemento("torre hip hop");
        end.setEstado("Bahia");
        end.setPais("Brasil");

        System.out.println("Nome: " + contato.getNome());

        //primeiro tem que setar o objeto antes de realizar o get.

            contato.setTelefones(telefones);

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone phone : contato.getTelefones()) {

                System.out.println("Telefone " + phone.getTipo());
                System.out.println(phone.getDdd() + " " + phone.getNumero());

            }
            System.out.println();
            System.out.println("endereço ");
            //primeiro tem que setar o objeto antes de realizar o get.
            contato.setEndereco(end);

            if (contato != null && contato.getEndereco() != null) {
                System.out.println("Rua " + contato.getEndereco().getNomeRua());
                System.out.println("Cidade " + contato.getEndereco().getCidade());
                System.out.println("Estado " + contato.getEndereco().getEstado());
                System.out.println("Pais " + contato.getEndereco().getPais());
                System.out.println("Cep " + contato.getEndereco().getCep());
            }
        }
    }
}
