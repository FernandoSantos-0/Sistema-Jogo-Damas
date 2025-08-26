package boardgame;

import pieces.Piece;

public class Tabuleiro {

    private Piece[][] tabuleiro = new Piece[8][8];

    public Tabuleiro(){}

    public Piece[][] getTabuleiro() {
        return tabuleiro;
    }

    public void moverPecas(int daLinha,int daColuna,int paraLinha,int paraColuna){

        tabuleiro[paraLinha][paraColuna] = tabuleiro[daLinha][daColuna];
        tabuleiro[daLinha][daColuna] = null;

    }

    public void incluirPeca(Piece peca){
        tabuleiro[peca.getLinha()][peca.getColuna()] = peca;
    }

    public void imprimirTabuleiroPespectivaPreta(){

        System.out.println();

        for (int i = 0; i < tabuleiro.length; i++){

            System.out.print((i)+ " ");

            for (int c = 0; c < tabuleiro.length; c++){

                if (tabuleiro[i][c] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+tabuleiro[i][c].getSimbolo()+" ");
                }

            }
            System.out.println();
        }
        System.out.println("   0  1  2  3  4  5  6  7");
    }

    public void imprimirTabuleiroPespectivaBrancas(){

        System.out.println();

        for (int i = 7; i >= 0; i--){

            System.out.print((i)+ " ");

            for (int c = 7; c >=0; c--){

                if (tabuleiro[i][c] == null){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+tabuleiro[i][c].getSimbolo()+" ");
                }

            }
            System.out.println();
        }
        System.out.println("   0  1  2  3  4  5  6  7");
    }

    public boolean verSeTemPecaTabuleiro(String cor){

        for (int i = 0; i < 8; i++) {

            for (int c = 0; c < 8; c++) {

                if (tabuleiro[i][c] != null && tabuleiro[i][c].getCor().equalsIgnoreCase(cor)){
                    return true;
                }

            }
        }
        return false;

    }



}
