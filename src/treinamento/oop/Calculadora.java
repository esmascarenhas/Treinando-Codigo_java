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

}
