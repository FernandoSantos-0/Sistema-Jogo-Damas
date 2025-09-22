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

    public void moverPeca(Position daPosition,Position paraPosition){



    }

}
