package boardgame;

import pieces.Piece;

import java.util.List;

public class Tabuleiro {

    private Piece[][] matriz = new Piece[8][8];

    public Tabuleiro() {
    }

    public Tabuleiro(Piece[][] matriz) {
        this.matriz = matriz;
    }

    public Piece[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Piece[][] matriz) {
        this.matriz = matriz;
    }

    public void incluirPeca(Piece piece) {
        matriz[piece.getPosicao().getLinha()][piece.getPosicao().getColuna()] = piece;
    }

    public void incluirTodaspeca(List<Piece> pecas) {

        for (Piece piece : pecas) {

            matriz[piece.getPosicao().getLinha()][piece.getPosicao().getColuna()] = piece;
        }
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {

            result.append(i).append(" ");

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == null) {

                    result.append(" - ");

                } else {

                    result.append(" ").append(matriz[i][j].toString()).append(" ");
                }
            }

            result.append("\n");
        }
        result.append("   0  1  2  3  4  5  6  7");

        return result.toString();

    }
}
