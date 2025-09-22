package boardgame;

import pieces.Piece;

import java.util.Scanner;

public class Partida {

    public static void partida(){

        Scanner sc = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();

        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 8; c++) {
                if ((i + c) % 2 != 0) {
                    Position posicao = new Position(i, c);
                    tabuleiro.inseriPeca(posicao, new Piece("PRETO", 'P', posicao));
                }
            }
        }

        for (int i = 5; i < 8; i++) {
            for (int c = 0; c < 8; c++) {
                if ((i + c) % 2 != 0) {
                    Position posicao = new Position(i, c);
                    tabuleiro.inseriPeca(posicao, new Piece("BRANCO", 'B', posicao));
                }
            }
        }

        boolean rodando = true;

        int turno = 0;

        do{

            tabuleiro.imprimir();
            System.out.println();

            if(turno % 2 == 0){
                System.out.println("Brancas: ");
            }
            else{
                System.out.println("Pretas: ");
            }

            System.out.println("DE linha, coluna: ");
            Position daPosicao = new Position(sc.nextInt(),sc.nextInt());
            System.out.println("PARA linha, coluna: ");
            Position paraPosicao = new Position(sc.nextInt(),sc.nextInt());

            if (tabuleiro.getPiece(daPosicao).getCor().equalsIgnoreCase("BRANCO") && turno%2 == 0) {}
            else{}


            turno++;

        }while(rodando);

    }

}
