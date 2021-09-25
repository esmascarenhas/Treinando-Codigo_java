package usandoenums;

public class CalculadoraComEnum {


    enum Operacao {
        SOMAR ("+"){
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR ("-"){
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR ("*"){
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR ("/"){
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }


        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {
        double x = 20;
        double y = 3;

        for ( Operacao calc : Operacao.values()){
            System.out.println(x + " " + calc.toString() + " " + y + " = ");
            System.out.println(calc.executarOperacao(x,y));
        }
    }

}

