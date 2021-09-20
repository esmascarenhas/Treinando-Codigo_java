package treinamento.oop;

public class Calculadora {


    public Calculadora() {
    }
    public static int somar(int x, int y){
        return x + y;
    }
    public static int subtrair(int x, int y){
        return x - y;
    }
    public static int multiplicar(int x, int y){
        return x * y;
    }
    public static double dividir(double x, double y){
        return x / y;
    }
    public static int elevarPotenciaN(int x, int y){
       int total =1;
       for(int i =0; i<y;i++){
           total *= x;
       }
       return total;
    }
    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    public static int fatorialNaoRecursivo(int num){
        if(num == 0){
                return 1;
            }
            int total =1;
            for(int i = num; i>1;i--){
                    total *= i;
                }
            return total;
        }

    public static int fatorialRecursivo(int num){
        if(num == 0){
            return  1;
        }
        return num * fatorialRecursivo(num-1);
    }

    public static int fibonacci(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

        // 5 = 5 + somatorio(4)
        // 4 = 4 + somatorio(3)
        // 3 = 3 + somatorio(2)
        // 2 = 2 + somatorio(1)
        // 1 = 1
        public static int somatorio(int x){

            if (x == 1) {
                return 1;
            }

            return x + somatorio(x - 1);
        }
    }


