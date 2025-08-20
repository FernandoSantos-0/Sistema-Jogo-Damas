package pieces;

import boardgame.Position;
import enums.Color;

public class Piece {

    private Color cor;
    private Position posicao;

    public Piece(){}

    public Piece(Color cor, Position posicao) {
        this.cor = cor;
        this.posicao = posicao;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Position getPosicao() {
        return posicao;
    }

    public void setPosicao(Position posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "P";
    }
}
