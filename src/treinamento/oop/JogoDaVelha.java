package treinamento.oop;

public class JogoDaVelha {
    public char[][] jogoDaVelha = new char[3][3];
    public int jogada = 1;

    public boolean validarJogada(int linha, int coluna, char sinal) {
        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
            return false;
        } else {
            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {

                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();
        }

    }

    public boolean verificarGanhador(char sinal) {
        if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) || //linha 1
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) || //linha 2
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) || //linha 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) || //Coluna 1
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) || //Coluna 2
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) || //Coluna 3
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) || //Diagonal
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][0] == sinal)) { //Diagonal Inversa
            return true;
        }
        return false;
    }
    public boolean vezJogador1(){
        if(jogada % 2 ==1){
            return true;
        }
        return false;
    }
}
