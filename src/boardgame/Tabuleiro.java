package boardgame;

import pieces.Piece;

public class Tabuleiro {

    private Piece tabuleiro[][] = new Piece[8][8];

    public Piece[][] getPiece() {
        return tabuleiro;
    }

    public void setTabuleiro(Piece tabuleiro[][]) {
        this.tabuleiro = tabuleiro;
    }

    public void imprimir(){

        for (int i = 0 ; i < 8;i++ ) {

            System.out.print((8-i)+" ");

            for (int c = 0 ; c < 8;c++ ) {

                if (tabuleiro[i][c] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(tabuleiro[i][c].getCor());
                }

            }

            System.out.println();

        }
        System.out.println("   a  b  c  d  e  f  g  h");
    }

}
