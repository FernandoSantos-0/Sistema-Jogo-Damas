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

       // for (int i = 0 ; i < 2 ; i++){
       //     for (int c = 0 ; c < 8 ; c++){
                //tabuleiro.incluirPeca(new Piece(Color.BRANCO,new Position(i,c),'B'));
         //   }
        //}

        for (int i = 6 ; i < 8 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                tabuleiro.incluirPeca(new Piece(Color.PRETO,new Position(i,c),'P'));
            }
        }

        System.out.println();
        System.out.println(tabuleiro);

        int number = 1;

        do{

            System.out.println("Insira a linha e coluna para mexer(0 a 7): ");
            int linha = sc.nextInt();
            sc.nextLine();
            int coluna = sc.nextInt();
            sc.nextLine();

            System.out.println("Agora escolha para onde mover(0 a 7): ");
            int linhaMover = sc.nextInt();
            sc.nextLine();
            int colunaMover = sc.nextInt();
            sc.nextLine();

            Piece p = tabuleiro.getMatriz()[linha][coluna]; // separando a peca escolhida da matriz

            tabuleiro.getMatriz()[linha][coluna] = null; // colocando o valor null no local escolhido para movimento

            p.comportamentoMovimento(new Position(linhaMover,colunaMover)); // ver se o movimento e posivel se sim move, se nao fica no msm local

            p.updatedama(); // ver se a peça virou dama

            tabuleiro.incluirPeca(p); // incluido peça na matriz do tabuleiro para imprimir

            System.out.println(tabuleiro); // imprimi o tabuleiro

            System.out.println("Quer continuar insira qualquer numero, sair = 0 : ");
            number = sc.nextInt();

        }while(number != 0);

        sc.close();
    }

}
