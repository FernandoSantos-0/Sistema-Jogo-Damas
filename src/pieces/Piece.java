package pieces;

public class Piece {

    private int linha;
    private int coluna;
    private String cor;
    private char simbolo;
    private int turno;

    public Piece(){}

    public Piece(int linha, int coluna, String cor, char simbolo) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.simbolo = simbolo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
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

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

}
