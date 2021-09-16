package fibonate;

import java.util.Scanner;

public class Fibonate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um limite " );
        int f1 = 0;
        int f2 = 1;
        int limit = input.nextInt();
        while (f1 < limit) {
            int fn = f1 + f2;
            if (fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;

        }
    }
}
