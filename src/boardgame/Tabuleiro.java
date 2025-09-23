package boardgame;

import pieces.Piece;

public class Tabuleiro {

    private Piece tabuleiro[][] = new Piece[8][8];

    public Piece getPiece(Position position) {
        return tabuleiro[position.getLinha()][position.getColuna()];
    }

    public void setTabuleiro(Piece tabuleiro[][]) {
        this.tabuleiro = tabuleiro;
    }

    public void inseriPeca(Position position,Piece peca){
        tabuleiro[position.getLinha()][position.getColuna()] = peca;
    }

    public void imprimir(){

        for (int i = 0 ; i < 8;i++ ) {

            System.out.print((8-i)+" ");

            for (int c = 0 ; c < 8;c++ ) {

                if (tabuleiro[i][c] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+tabuleiro[i][c].getSimbolo()+" ");
                }

            }

            System.out.println();

        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }

    public void movePeca(Position daPosition,Position paraPosition){

        tabuleiro[paraPosition.getLinha()][paraPosition.getColuna()] = tabuleiro[daPosition.getLinha()][daPosition.getColuna()];
        tabuleiro[daPosition.getLinha()][daPosition.getColuna()] = null;

    }

    public void controleMoverPeca(Position daPosition,Position paraPosition){

        int diffLinha = paraPosition.getLinha() - daPosition.getLinha();
        int diffColuna = paraPosition.getColuna() - daPosition.getColuna();

        // ver se o movimento ta na diagonal
        if (Math.abs(diffLinha) != Math.abs(diffColuna)) {
            System.out.println("Movimento inválido! Só pode andar em diagonal.");
            return;
        }

        // movimento normal 1 casa
        if (Math.abs(diffLinha) == 1 && Math.abs(diffColuna) == 1) {
            movePeca(daPosition, paraPosition);
        }
        // movimento de captura 2 casas
        else if (Math.abs(diffLinha) == 2 && Math.abs(diffColuna) == 2) {
            movePeca(daPosition, paraPosition);
        }
        else {
            System.out.println("Movimento inválido! Só pode andar 1 casa (ou 2 se for captura).");
        }

    }

}
