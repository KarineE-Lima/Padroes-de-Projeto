package estruturais.flyweight.ex02;
// extrinseco
public class Caractere {
    private char simbolo;
    private int posicaoX;
    private int posicaoY;
    EstiloFonte estiloFonte;
    public Caractere(char simbolo, int posicaoX, int posicaoY, EstiloFonte estiloFonte){
        this.simbolo = simbolo;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.estiloFonte = estiloFonte;
    }
    public void desenharCaractere(){
        estiloFonte.desenharCaractere(simbolo, posicaoX, posicaoY);
    }
}
