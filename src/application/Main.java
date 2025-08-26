package application;

import boardgame.Tabuleiro;
import pieces.Piece;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Tabuleiro tabuleiro = new Tabuleiro();

        for (int c = 0; c < 2;c++) {
            for (int i = 0; i < 8; i++) {
                tabuleiro.incluirPeca(new Piece(c,i,"BRANCO",'B'));
            }
        }
        for (int c = 6; c < 8;c++) {
            for (int i = 0; i < 8; i++) {
                tabuleiro.incluirPeca(new Piece(c,i,"PRETO",'P'));
            }
        }

        boolean rodando;

        do {

            tabuleiro.imprimirTabuleiroPespectivaBrancas();

            System.out.print("Da Linha Coluna: ");
            int daLinha = sc.nextInt();
            int daColuna = sc.nextInt();

            System.out.print("Para Linha Coluna: ");
            int paraLinha = sc.nextInt();
            int paraColuna = sc.nextInt();

            tabuleiro.moverPecas(daLinha,daColuna,paraLinha,paraColuna);

            rodando = tabuleiro.verSeTemPecaTabuleiro("BRANCO");
            if(!rodando){
                break;
            }
            else {
                rodando = tabuleiro.verSeTemPecaTabuleiro("PRETO");
            }


        } while (rodando);

    }

}
