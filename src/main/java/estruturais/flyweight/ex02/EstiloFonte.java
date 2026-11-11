package estruturais.flyweight.ex02;
// flyweight: intriseco
public class EstiloFonte{
    private String nomeFonte;
    private int tamanho;
    private boolean negrito;
    public EstiloFonte(String nomeFonte, int tamanho, boolean negrito){
        this.nomeFonte = nomeFonte;
        this.tamanho = tamanho;
        this.negrito = negrito;
    }
    public void desenharCaractere(char caractere, int posicaoX, int posicaoY) {
        System.out.println("[DESENHANDO] '" + caractere + "' na pos (" + posicaoX + "," + posicaoY + ") com estilo [" + nomeFonte + ", tamanho " + tamanho + "]");
    }
}
