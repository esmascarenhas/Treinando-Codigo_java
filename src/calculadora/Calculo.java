package calculadora;

import static java.lang.Long.sum;
import static javax.swing.Spring.minus;

public class Calculo {

    public static void main(String[] args) {
     /*   calc(20,5);*/
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double c = Math.PI;
        double d = Math.pow(c,2);
        System.out.println(d);

        if (args[0].equals("somar")) {
           sum(a,b);
        } else if (args[0].equals("subtrair")) {
         minus (a,b);
        } else {
            System.out.println("Nenhuma instrução definida ");
        }
    }
            static void sum ( int a, int b){
                System.out.println(a + b);
            }
            static void minus( int a, int b){
                System.out.println(a - b);
            }
            /*static void calc (int a , int b){

                System.out.println(a+b);
                System.out.println(a-b);
                System.out.println(a*b);
                System.out.println(a/b);
            }*/
        }


