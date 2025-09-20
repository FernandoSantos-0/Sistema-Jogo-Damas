package pieces;

import boardgame.Position;

public class Piece {

    private String cor;
    private char simbolo;
    private Position position;

    public Piece(){}

    public Piece(String cor, char simbolo, Position position) {
        this.cor = cor;
        this.simbolo = simbolo;
        this.position = position;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
