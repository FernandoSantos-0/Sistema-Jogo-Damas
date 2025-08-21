package pieces;

import boardgame.Position;
import enums.Color;

public class Piece {

    private Color cor;
    private Position posicao;
    private char simbolo;

    public Piece(){}

    public Piece(Color cor, Position posicao,char simbolo) {
        this.cor = cor;
        this.posicao = posicao;
        this.simbolo = simbolo;
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

    public void comportamentoMovimento(Position novaPosicao) {
        int difLinha = novaPosicao.getLinha() - this.posicao.getLinha();
        int difColuna = novaPosicao.getColuna() - this.posicao.getColuna();

        if (Math.abs(difLinha) == 1 && difColuna == 0   // andar 1 pra frente ou pra trás
                || Math.abs(difColuna) == 1 && difLinha == 0) // andar 1 pro lado
        {
            this.posicao = novaPosicao;
        }
    }


    @Override
    public String toString() {
        return ""+simbolo;
    }
}
