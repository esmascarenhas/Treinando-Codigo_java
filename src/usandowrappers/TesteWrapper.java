package usandowrappers;

public class TesteWrapper {

    public static void main(String[] args) {


        //primitivos inteiros
        short num1 = 1;
        byte num2 = 10;
        int num3 = 1000;
        long num4 = 100000l;
        //primitivos flutuantes
        float num5 = 5.1f;
        double num6 = 6.89955;

        boolean flag = false;
        char simbolo = 'x';

        //classes dos primitivos
        Short s = new Short((short) 1);
        Byte b = new Byte((byte) 10);
        Integer i = new Integer(1000);
        Long l = new Long(100000l);
        Float f = new Float(5.1f);
        Double d = new Double(6.89955);
        Boolean bo = new Boolean(false);
        Character c = new Character('x');

        System.out.println(s + " " + b + " " + i + " " + l);
        System.out.println(f + " " + d + " " + bo + " "+ c);

        Integer num13 = new Integer("1000"); //NumberFormatException
        Double num14 = new Double("5.1"); //5,1 para quem usar PC PortuguÃªs Brasil

        System.out.println(num13.intValue());
        System.out.println(num13.longValue());

        Long num15 = num13.longValue();
        int num16 = Integer.parseInt("1000"); //NumberFormatException
        double num17 = Double.parseDouble("5.15226"); //NumberFormatException
        System.out.println(num17);

        Integer num18 = Integer.valueOf(13456);
        System.out.println(num18);

        System.out.println(i == num3);
        System.out.println(num13 == num3);
        System.out.println(num13 == i); //== nÃ£o funciona com wrappers - false não se compara instâncias diferentes com ==
        System.out.println(num13.equals(i));

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l; //new Long(10000l);
        Float num11 = 3.5f; //new Float(3.5f);
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character b_ = 'b';

        //auto un-boxing
        int num20 = num9; //num9.intValue();

        //autoboxing em expressÃµes
        num9++;

        System.out.println(num9);

        //auto unboxing num9 -> autoboxing num13/num9 -> num14
        Integer num19 = num13/num9;

        //mau uso
        Double a, r, e;
        a = 10.0;
        r = 12.2;
        e = 4.7;

        Double media = (a+r+e)/3;
        System.out.println(media);





    }

}
