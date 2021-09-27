package usandosynchronized;

public class TesteSynchronized {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        MinhaThreadSoma tsoma = new MinhaThreadSoma("#1",array);
        MinhaThreadSoma tsoma1 = new MinhaThreadSoma("#2",array);

    }
}
