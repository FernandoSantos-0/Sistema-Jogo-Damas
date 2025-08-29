package boardgame;

import pieces.Piece;

public class Tabuleiro {

    private Piece[][] tabuleiro = new Piece[8][8];
    private int turno;

    public Tabuleiro() {
    }

    public Piece[][] getTabuleiro() {
        return tabuleiro;
    }

    public void moverPecas(int daLinha, int daColuna, int paraLinha, int paraColuna,int flagTurno) {

        int diffLinha = paraLinha - daLinha;
        int diffColuna = paraColuna - daColuna;

        if (flagTurno%2 == 0){

            if(tabuleiro[daLinha][daColuna].getCor().equalsIgnoreCase("PRETO")){
                System.out.println("Movimento inválido esse não é o seu turno!");
            }

            else{

                if (tabuleiro[daLinha][daColuna] != null && tabuleiro[paraLinha][paraColuna] != null && !tabuleiro[daLinha][daColuna].getCor().equals(tabuleiro[paraLinha][paraColuna].getCor())){

                    if ((diffLinha == 1 || diffLinha == -1) || (diffColuna == 1 || diffColuna == -1)) {
                        tabuleiro[paraLinha][paraColuna] = tabuleiro[daLinha][daColuna];
                        tabuleiro[daLinha][daColuna] = null;
                        tabuleiro[paraLinha][paraColuna].eDama(paraLinha);
                    }

                    else {
                        System.out.println("Movimento inválido!");
                    }
                }
                else{
                    System.out.println("Movimento inválido! peça iqual no lugar que vc quer mover!");
                }
            }
        }

        else{

            if(tabuleiro[daLinha][daColuna] != null && tabuleiro[paraLinha][paraColuna] != null && tabuleiro[daLinha][daColuna].getCor().equalsIgnoreCase("BRANCO")){
                System.out.println("Movimento inválido!");
            }

            else{

                if (tabuleiro[daLinha][daColuna] != null && !tabuleiro[daLinha][daColuna].getCor().equals(tabuleiro[paraLinha][paraColuna].getCor())) {

                    if ((diffLinha == 1 || diffLinha == -1) || (diffColuna == 1 || diffColuna == -1)) {
                        tabuleiro[paraLinha][paraColuna] = tabuleiro[daLinha][daColuna];
                        tabuleiro[daLinha][daColuna] = null;
                        tabuleiro[paraLinha][paraColuna].eDama(paraLinha);
                    } else {
                        System.out.println("Movimento inválido!");
                    }
                }
                else{
                    System.out.println("Movimento inválido! peça iqual no lugar que vc quer mover!");
                }
            }
        }


    }

    public void incluirPeca(Piece peca) {
        tabuleiro[peca.getLinha()][peca.getColuna()] = peca;
    }

    public void imprimirTabuleiroPespectivaPreta() {

        System.out.println();

        for (int i = 0; i < tabuleiro.length; i++) {

            System.out.print((i) + " ");

            for (int c = 0; c < tabuleiro.length; c++) {

                if (tabuleiro[i][c] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + tabuleiro[i][c].getSimbolo() + " ");
                }

            }
            System.out.println();
        }
        System.out.println("   0  1  2  3  4  5  6  7");
    }

    public void imprimirTabuleiroPespectivaBrancas() {

        System.out.println();

        for (int i = 7; i >= 0; i--) {

            System.out.print((i) + " ");

            for (int c = 7; c >= 0; c--) {

                if (tabuleiro[i][c] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + tabuleiro[i][c].getSimbolo() + " ");
                }

            }
            System.out.println();
        }
        System.out.println("   7  6  5  4  3  2  1  0");
    }

    public boolean verSeTemPecaTabuleiro(String cor) {

        for (int i = 0; i < 8; i++) {

            for (int c = 0; c < 8; c++) {

                if (tabuleiro[i][c] != null && tabuleiro[i][c].getCor().equalsIgnoreCase(cor)) {
                    return true;
                }

            }
        }
        return false;

    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void turnoPartida(int daLinha, int daColuna, int flag) {}
}
