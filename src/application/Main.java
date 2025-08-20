package application;

import boardgame.Position;
import enums.Color;
import pieces.Piece;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Piece[][] matriz = new Piece[8][8];

        for (int i = 0 ; i < 2 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                matriz[i][c] = new Piece(Color.BRANCO,new Position(i,c));
            }
        }

        for (int i = 6 ; i < 8 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                matriz[i][c] = new Piece(Color.PRETO,new Position(i,c));
            }
        }

        for (int i = 0 ; i < 8 ; i++){
            for (int c = 0 ; c < 8 ; c++){
                if(matriz[i][c] == null){
                    System.out.print(" - ");
                }
                else {
                    System.out.print(" " + matriz[i][c].toString()+" ");
                }
            }
            System.out.println();
        }


        sc.close();
    }

}
