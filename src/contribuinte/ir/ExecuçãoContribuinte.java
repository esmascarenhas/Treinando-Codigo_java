package contribuinte.ir;

public class ExecuçãoContribuinte {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica();
        p1.setNomeContribuinte("Emerson");
        p1.setCpf("225466332");
        p1.setRendaBruta(1500);

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNomeContribuinte("Cacau Show");
        p2.setCnpj("254444455221000032");
        p2.setRendaBruta(8000014);

        PessoaFisica p3 = new PessoaFisica();
        p3.setNomeContribuinte("Tiago");
        p3.setCpf("22458966332");
        p3.setRendaBruta(2900);

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNomeContribuinte("C&A");
        p4.setCnpj("25444448752210002");
        p4.setRendaBruta(10002.425);

        PessoaFisica p5 = new PessoaFisica();
        p5.setNomeContribuinte("Josi");
        p5.setCpf("2254879966445");
        p5.setRendaBruta(5500);

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNomeContribuinte("valdgsss");
        p6.setCnpj("2544877554221000032");
        p6.setRendaBruta(253325.22);

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte contr : contribuintes){
            System.out.println(contr.toString());
        }


    }
}
