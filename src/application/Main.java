package application;

import boardgame.Position;
import boardgame.Tabuleiro;
import enums.Color;
import pieces.Piece;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Tabuleiro tabuleiro = new Tabuleiro();

        for (int i = 0 ; i < 2 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                tabuleiro.incluirPeca(new Piece(Color.BRANCO,new Position(i,c),'B'));
            }
        }

        for (int i = 6 ; i < 8 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                tabuleiro.incluirPeca(new Piece(Color.PRETO,new Position(i,c),'P'));
            }
        }

        System.out.println();
        System.out.println(tabuleiro);

        int cor;

        do{

            System.out.println("Linha Coluna: ");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            System.out.println("Linha Coluna(Mover): ");
            int linhaMover = sc.nextInt();
            int colunaMover = sc.nextInt();

            Piece p = tabuleiro.getMatriz()[linha][coluna]; // separando a peca escolhida da matriz

            tabuleiro.getMatriz()[linha][coluna] = null; // colocando o valor null no local escolhido para movimento

            p.comportamentoMovimento(new Position(linhaMover,colunaMover)); // ver se o movimento e posivel se sim move, se nao fica no msm local

            p.updatedama(); // ver se a peça virou dama

            tabuleiro.incluirPeca(p); // incluido peça na matriz do tabuleiro para imprimir

            System.out.println(tabuleiro); // imprimi o tabuleiro

            cor = tabuleiro.quantidadePecas(Color.BRANCO); // verifica se o jogo acabou

        }while(cor != 0);

        sc.close();
    }

}
