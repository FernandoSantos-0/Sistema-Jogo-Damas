package pieces;

import boardgame.Position;
import enums.Color;

public class Piece {

    public String i = "";

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

        if (Math.abs(difLinha) == 1 && difColuna == 0 || Math.abs(difColuna) == 1 && difLinha == 0) {
            this.posicao = novaPosicao;
        }
    }

    public void updatedama(){

        if (cor == Color.BRANCO){
            if (posicao.getColuna() == 7){
                i = "'";
            }
        }
        else{
            if(posicao.getColuna() == 0){
                i = "'";
            }
        }
    }

    @Override
    public String toString() {
        return simbolo+i;
    }
}
