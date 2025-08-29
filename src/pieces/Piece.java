package pieces;

public class Piece {

    private int linha;
    private int coluna;
    private String cor;
    private String simbolo;

    public Piece(){}

    public Piece(int linha, int coluna, String cor, String simbolo) {
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

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void eDama(int paralinha){

        if (cor.equalsIgnoreCase("PRETO") && paralinha == 0){
            simbolo = simbolo+"'";
        }
        else if (cor.equalsIgnoreCase("BRANCO") && paralinha == 7){
            simbolo = simbolo+"'";
        }

    }

}
