package usandoimportstatic;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {

    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = 3;

        //evita usar o Math.
        System.out.println(pow(a , c));
        System.out.println(sqrt(b));


    }
}
