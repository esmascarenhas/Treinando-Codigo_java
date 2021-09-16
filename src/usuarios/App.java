package usuarios;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // Converter tipos primitivos usando casting
/*
        double dd = 80.99;
        short ss = 12;

        Scanner cast = new Scanner(System.in);
        int e = (int) cast.nextDouble();
        System.out.println(e);*/

        String q = "Olá Dev, eu Quero ser um Dev ";
        System.out.println(q.length());
        System.out.println(q + " E vou! ");
        System.out.println(q.contains("dev"));
        System.out.println(q.indexOf("dev"));
        System.out.println(q.lastIndexOf("dev"));
        System.out.println(q.toLowerCase());
        System.out.println(q.toUpperCase());
        System.out.println(q.trim());
        System.out.println(q.substring(7));
        System.out.println(q.equals("Olá"));


    //Ordenamento de array
     /*   String[] cor = new String[]{"Azul","Preto","Branco","Amarelo","Verde","Marrom"};
        Arrays.sort(cor);
        System.out.println(Arrays.toString(cor));*/

// Comparando Array
//        String[] cor = new String[]{"Azul","Preto","Branco","Amarelo","Verde","Marrom"};
//        String[] cor1 = new String[]{"Azul","Preto","Branco","Amarelo","Verde","Marrom"};
//        System.out.println(Arrays.equals(cor,cor1));

        //instanciando o objeto User
/*        User users = new User();
        users.setFirstname("emerson mascarenhas");

        User usersb = new User ();
        usersb.setFirstname("tiago sampaio");

        System.out.println(users.getFirstname() + " Pai de " + usersb.getFirstname() );*/

        //Array padrão como limite
   /*     User[] client = new User[10];

        for (int i = 0; i < client.length; i++) {
            User actual = new User();
            actual.setFirstname(" Nome " + i);
            actual.setLastname(" Sobrenome " + i);
            client[i] = actual;
        }

        System.out.println(client[2].getFirstname());
        System.out.println(client[2].getLastname());*/


/*        User[] client = new User[]{
            new User("Emerson", "Mascarenhas"),
            new User("Josi", "Sampaio"),
            new User("Tiago", "de Souza")
        };

        System.out.println(client[2].getFirstname() + " " + client[2].getLastname());*/

        //usando array para alimentar lista

      /*  List<Product> product = new ArrayList<>();*/

//        int i =  0;
//        while (i < 10){
//            Product novo = new Product("Produto" + i, "Cor"  + i, 4  );
//            product.add(novo);
//            i++;
//
//        }
        /*System.out.println(product.get(8).getName()+ " " +product.get(8).getDescrição()+ " " + product.get(8).getQuantidade());*/

            //preenchimento de um array
/*
    String[] livro = new String[10];
        Arrays.fill(livro, "Diversos");
        System.out.println(Arrays.toString(livro));
*/

  /*      List<String> escola = new ArrayList<>();

        //Como adicionar elementos
        escola.add("Vitoria Régia");
        escola.add("CEMJ");
        escola.add("Favo de Mel");
        escola.add("Sartre");*/

    //ordenando com o collections
/*        Collections.sort(escola);

        for (String nome : escola){
        System.out.println(nome);}*/




        //Como buscar um elemento na lista

    /*    for (int i = 0; i < escola.size();i++) {
            System.out.println(escola.get(i));
        }*/

    //buscar o indice através do nome
//        System.out.println(escola.indexOf("Sartre"));
    //lista está vazia?
//        System.out.println(escola.isEmpty());
        //contem elementos
   /*     System.out.println(escola.contains("Favo de Mel"));
        System.out.println(escola.contains("Resgate"));*/

        //tamanho da lista
/*        System.out.println(escola.size());*/
    //apagando o objeto
       // escola = null;
        //apagando os elementos da lista
       /* escola.clear();
        System.out.println(escola.isEmpty());*/
    }
}
